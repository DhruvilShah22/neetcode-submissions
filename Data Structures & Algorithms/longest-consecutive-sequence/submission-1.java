class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);

        int maxi = 0;
        int count = 0;
        int prev = pq.poll();
        while(!pq.isEmpty()){
            if(prev != pq.peek()){
                if(prev + 1 == pq.peek()){
                    count ++;
                }
                else{
                    maxi = Math.max(maxi, count);
                    count = 0;
                }
            }
            prev = pq.poll();
        }
        return Math.max(maxi, count) + 1;
    }
}
