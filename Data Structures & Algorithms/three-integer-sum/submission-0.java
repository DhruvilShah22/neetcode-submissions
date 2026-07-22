class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int size = nums.length;

        for(int i = 0; i < size - 2; i ++){
            int i1 = i + 1;
            int i2 = size - 1;
            if(nums[i] > 0){
                break;
            }
            while(i2 > i1){
                long sum = nums[i] + nums[i1] + nums[i2];
                if(sum == 0){
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[i1]);
                    inner.add(nums[i2]);
                    if(set.add(inner)){
                        list.add(inner);
                    }
                    i2--;
                    i1++;
                }
                else if(sum > 0){
                    i2--;
                }
                else{
                    i1++;
                }
            }
        }

        return list;
    }
}
