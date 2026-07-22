class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int size = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for(int i = 0; i < size; i ++){
            int[] arr = new int[26];
            char[] cArr = strs[i].toCharArray();
            int cSize = cArr.length;
            for(int j = 0; j < cSize; j ++){
                arr[cArr[j] - 'a']++; 
            }
            StringBuilder st = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                st.append(arr[j]).append('#');
            }
            List<String> inner = map.getOrDefault(st.toString(), new ArrayList<>());
            inner.add(strs[i]);
            map.put(st.toString(), inner);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
}
