class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int size = arr.length;
        if (size <= 1) {
            return size;
        }

        int maxi = 0;
        int count = 0;
        int start = 0;
        
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {

            int index = map.getOrDefault(arr[i], -1);

            if (index >= start) {
                start = index + 1;
            }

            map.put(arr[i], i);

            count = i - start + 1;
            maxi = Math.max(maxi, count);
        }

        return maxi;
    }
}
