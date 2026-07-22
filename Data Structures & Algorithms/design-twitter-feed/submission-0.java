class Twitter {

    private Map<Integer, List<Integer>> userTweets;
    private Map<Integer, Set<Integer>> userFollowee;
    private Map<Integer, Long> tweetsTime;
    private long globalTime;

    public Twitter() {
        userTweets = new HashMap<>();
        userFollowee = new HashMap<>();
        tweetsTime = new HashMap<>();
        globalTime = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        userTweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(tweetId);
        tweetsTime.put(tweetId, globalTime++);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Map.Entry<Integer, Long>> tweetPairs = new ArrayList<>();
    
        List<Integer> ownTweets = userTweets.getOrDefault(userId, new ArrayList<>());
        for (int tweetId : ownTweets) {
            tweetPairs.add(new AbstractMap.SimpleEntry<>(tweetId, tweetsTime.get(tweetId)));
        }
        
        Set<Integer> follows = userFollowee.getOrDefault(userId, new HashSet<>());
        for (int followeeId : follows) {
            if (followeeId == userId) continue; 
            
            List<Integer> followeeTweets = userTweets.getOrDefault(followeeId, new ArrayList<>());
            for (int tweetId : followeeTweets) {
                tweetPairs.add(new AbstractMap.SimpleEntry<>(tweetId, tweetsTime.get(tweetId)));
            }
        }
        
        return tweetPairs.stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
            .limit(10).map(Map.Entry::getKey).toList();
    }
    
    public void follow(int followerId, int followeeId) {
        userFollowee.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (userFollowee.containsKey(followerId)) {
            userFollowee.get(followerId).remove(followeeId);
        }
    }
}