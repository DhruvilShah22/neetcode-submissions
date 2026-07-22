class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int size = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i <  size - 3; i ++){
            for(int j = i + 1; j < size - 2; j ++){
                int j1 = j + 1;
                int j2 = size - 1;

                while(j2 > j1){
                    long sum = (long) nums[i] + nums[j] + nums[j1] + nums[j2];
                    if(sum == target){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[j1]);
                        inner.add(nums[j2]);
                        if(set.add(inner)){
                            list.add(inner);
                        }
                        while (j1 < j2 && nums[j1] == nums[j1 + 1]) j1++;
                        while (j1 < j2 && nums[j2] == nums[j2 - 1]) j2--;
                        j1++;
                        j2--;
                    }
                    else if(sum > target){
                        j2--;
                    }
                    else{
                        j1++;
                    }
                }
            }
        }

        return list;
    }
}