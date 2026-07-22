class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        int count = 0;

        while (r > l) {
            if (arr[l] == arr[r]) {
                l++;
                r--;
            } else {
                count++;
                if (count > 1) return false;

                return isPalindrome(arr, l + 1, r) ||
                       isPalindrome(arr, l, r - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(char[] arr, int l, int r) {
        while (l < r) {
            if (arr[l] != arr[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}
