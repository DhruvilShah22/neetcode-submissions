class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if(size == 1){
            return nums[0];
        }
        else if(size == 3){
            int big = nums[0];
            for(int i = 1; i < size; i ++){
                big = Math.max(big, nums[i]);
            }
            return big;
        }
        int val1 = robHouse(nums, 0, size - 2);
        int val2 = robHouse(nums, 1, size - 1);

        return Math.max(val1, val2);
    }

    public int robHouse(int[] nums, int start, int size){
        int prev1 = 0;
        int prev2 = 0;
        for(int i = start; i <= size; i ++){
            int temp = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}