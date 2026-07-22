class Solution {
    public boolean isAnagram(String s, String t) {
        int size = s.length();
        if(size != t.length()){
            return false;
        }
        int index = 0;
        char[] arr1 = new char[26];
        char[] arr2 = new char[26];
        char[] charArr = s.toCharArray();
        
        for(int i = 0; i < size; i ++){
            arr1[charArr[i] - 'a']++; 
        }
        charArr = t.toCharArray();
        for(int i = 0; i < size; i ++){
            arr2[charArr[i] - 'a']++; 
        }
        
        for(int i = 0; i < 26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}
