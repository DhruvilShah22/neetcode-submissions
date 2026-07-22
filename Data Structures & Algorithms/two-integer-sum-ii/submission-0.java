class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int i1 = 0;
        int i2 = size - 1;
        while(i2 > i1){
            if(numbers[i1] == numbers[i2]){
                break;
            }
            else if(numbers[i1] + numbers[i2] == target){
                return new int[]{i1+1, i2+1};
            }
            else if(numbers[i1] + numbers[i2] > target){
                i2--;
            }
            else{
                i1++;
            }
        }
        return new int[]{};
    }
}
