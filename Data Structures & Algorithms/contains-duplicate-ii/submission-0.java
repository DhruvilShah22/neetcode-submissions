class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < size; i ++){
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>(0));
            list.add(i);
            map.put(nums[i], list);
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            size = list.size();
            if(size > 1){
                for(int i = 1; i < size; i++){
                    if(Math.abs(list.get(i) - list.get(i - 1)) <= k){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}