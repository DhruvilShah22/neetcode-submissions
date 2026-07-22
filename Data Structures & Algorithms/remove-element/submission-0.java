class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int fresh = size;
        int front = 0;
        int back = size - 1;

        while(back >= front){
            if(nums[front] != val){
                front++;
            }
            else if(nums[front] == val && nums[back] != val){
                int temp = nums[back];
                nums[back] = nums[front];
                nums[front] = temp;
                back--;
                front++;
                fresh--;
            }
            else{
                while(back >= front && nums[back] == val){
                    back--;
                    fresh--;
                }
            }
        }

        return fresh;
    }
}