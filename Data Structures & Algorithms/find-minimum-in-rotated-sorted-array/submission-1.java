class Solution {
    public int findMin(int[] nums) {
        int size = nums.length;
        if(nums[0] < nums[size-1]){
            return nums[0];
        }
        int start = 0;
        int end = size - 1;
        while(end > start){
            if(nums[start] <= nums[end]){
                return nums[start];
            }
            int middle = start + (end - start) / 2;          
            if(nums[start] > nums[middle]){
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        if(nums[start] <= nums[end]){
            return nums[start];
        }
        return -1;
    }
}