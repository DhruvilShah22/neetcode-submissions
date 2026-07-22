class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            int count = map.getOrDefault(i, 0);
            map.put(i, ++count);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}