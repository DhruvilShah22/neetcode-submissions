class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] productLeft = new int[size];
        int[] productRight = new int[size];
        int prodLeft = 1;
        int prodRight = 1;

        for(int i = 0; i < size; i ++){
            productLeft[i] = prodLeft;
            prodLeft *= nums[i];
        }

        for(int i = size - 1; i >= 0; i --){
            productRight[i] = prodRight;
            prodRight *= nums[i];
        }

        for(int i = 0; i < size; i ++){
            nums[i] = productRight[i] * productLeft[i];
        }

        return nums;
    }
}  
