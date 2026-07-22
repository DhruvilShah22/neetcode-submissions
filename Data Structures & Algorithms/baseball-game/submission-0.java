class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int size = operations.length;
        int count = 0;

        for(String i : operations){
            if(i.equalsIgnoreCase("+")){
                int t1 = stack.pop();
                int t2 = stack.pop();
                stack.add(t2);
                stack.add(t1);
                stack.add(t1 + t2);
            }
            else if(i.equalsIgnoreCase("D")){
                stack.add(stack.peek() * 2);
            }
            else if(i.equalsIgnoreCase("C")){
                count -= stack.pop();
                continue;
            }
            else{
                stack.add(Integer.valueOf(i));
            }
            count += stack.peek();
        }

        return count;
    }
}