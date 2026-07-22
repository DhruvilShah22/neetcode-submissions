class Solution {
    public void reverseString(char[] s) {
        int r = s.length - 1;
        int l = 0;

        while(r > l){
            swap(s, r--, l++);
        }
    }

    public void swap(char[] s, int r, int l){
        char temp = s[r];
        s[r] = s[l];
        s[l] = temp;
    }
}