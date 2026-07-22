class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int size1 = arr1.length;
        int size2 = arr2.length;
        int i1 = 0;
        int i2 = 0;
        StringBuilder str = new StringBuilder();
        while(i1 < size1 && i2 < size2){
            str.append(arr1[i1++]);
            str.append(arr2[i2++]);
        }
        while(i1 < size1){
            str.append(arr1[i1++]);
        }
        while(i2 < size2){
            str.append(arr2[i2++]);
        }
        return str.toString();
    }
}