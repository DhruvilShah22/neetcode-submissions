class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        if(size % 2 == 0){
            maxi = size / 2;
        }
        else{
            maxi = 1 + (size / 2);
        }
        for(int i : nums){
            int count = map.getOrDefault(i, 0) + 1;
            if(maxi <= count){
                return i;
            }
            map.put(i, count);
        }
        return 0;
    }
}