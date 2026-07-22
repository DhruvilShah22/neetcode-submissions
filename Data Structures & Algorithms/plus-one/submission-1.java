class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder str = new StringBuilder();
        for(int i : digits){
            str.append("" + i);
        }
        long temp = Long.valueOf(str.toString()) + 1;
        String tempStr = String.valueOf(temp);
        int size = tempStr.length();
        int[] arr = new int[size];
        for(int i = 0; i < size; i ++){
            arr[i] = tempStr.charAt(i) - 48;
        }
        return arr;
    }
}
