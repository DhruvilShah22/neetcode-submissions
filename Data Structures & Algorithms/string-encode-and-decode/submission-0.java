class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String i : strs){
            int length = i.length();
            str.append(length);
            str.append('#');
            str.append(i);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int index = 0;
        int size = str.length();
        while(index < size){
            StringBuilder s = new StringBuilder();
            while(str.charAt(index) != '#'){
                s.append(str.charAt(index++));
            }
            int i = Integer.valueOf(s.toString()) + index;
            s = new StringBuilder();
            while(++index <= i && index < size){
                s.append(str.charAt(index));
            }
            list.add(s.toString());
        }
        return list;
    }
}
