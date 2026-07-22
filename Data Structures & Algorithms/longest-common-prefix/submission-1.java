class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        String str = strs[0];
        int strSize = str.length();

        for(int i = 1; i < size; i ++){
            int inner = strs[i].length();
            int index = 0;
            if(inner < strSize){
                strSize = inner;
            }
            while(index < strSize){
                if(strs[i].charAt(index) == str.charAt(index)){
                    index++;
                }
                else{
                    strSize = index;
                    break;
                }
            }
        }
        return str.substring(0, strSize);
    }
}