class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int size = nums.length;
        int start = 0;
        int end = 1;
        int cSum = nums[0];

        while(end < size){
            if(cSum >= target){
                minLength = Math.min(minLength, (end - start));
                cSum -= nums[start++];
            }
            else if(cSum < target){
                cSum += nums[end++];
            }
        }
        while(start < size && start <= end){
            if(cSum >= target){
                minLength = Math.min(minLength, (end - start));
            }
            cSum -= nums[start++];
        }
        if(cSum >= target){
            return Math.min(minLength, (end - start));
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}