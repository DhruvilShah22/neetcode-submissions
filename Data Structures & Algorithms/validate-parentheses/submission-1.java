class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int size = arr.length;
        if(size % 2 != 0){
            return false;
        }
        
        for(char i : arr){
            if(i == '(' || i == '[' || i == '{'){
                stack.add(i);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(i == ')'){
                if(stack.peek() != '('){
                    return false;
                }
                stack.pop();
            }
            else if(i == ']'){
                if(stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }
            else{
                if(stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
