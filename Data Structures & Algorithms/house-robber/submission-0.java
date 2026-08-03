class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if(size == 1){
            return nums[0];
        }
        else if(size == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        else if(size == 3){
            return nums[0] + nums[2] > nums[1] ? nums[0] + nums[2] : nums[1];
        }
        int[] dp = new int[size];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        
        for(int i = 3; i < size; i ++){
            dp[i] = nums[i] + Math.max(dp[i - 2], dp[i - 3]);
        }

        return dp[size - 2] > dp[size - 1] ? dp[size - 2] : dp[size - 1];
    }
}
