class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2 * size];
        for(int i = 0; i < size; i++){
            int num = nums[i];
            ans[i] = num;
            ans[i + size] = num;
        }
        return ans;
    }
}