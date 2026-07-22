class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] arr = new int[size];
        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        for(int i = 1; i < size; i ++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev = stack.pop();
                arr[prev] = i - prev; 
            }
            stack.add(i);
        }

        return arr;
    }
}
