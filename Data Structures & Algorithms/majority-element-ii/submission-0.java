class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int size = nums.length;
        int count = 1;

        for(int i = 1; i < size; i ++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                if(count > size/3){
                    list.add(nums[i-1]);
                }
                count = 1;
            }
        }
        if(count > size/3){
            list.add(nums[size-1]);
        }
        return list;
    }
}