class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] arr = s.toCharArray();
        int index = arr.length - 1;
        int count = map.get(arr[index--]);

        while(index >= 0){
            int temp = map.get(arr[index]);
            if(temp < map.get(arr[index+1])){
                count -= temp;
            }
            else{
                count += temp;
            }
            index --;
        }

        return count;
    }
}