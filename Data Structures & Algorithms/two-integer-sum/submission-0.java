class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < size; i ++){
            int diff = target - nums[i];
            if(null != map.get(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
