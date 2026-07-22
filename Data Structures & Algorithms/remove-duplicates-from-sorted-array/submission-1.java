class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : nums){
            boolean flagAdded = set.add(i);
            if(flagAdded){
                nums[count++] = i;
            }
        }
        Arrays.sort(nums, 0, count);
        return count;
    }
}