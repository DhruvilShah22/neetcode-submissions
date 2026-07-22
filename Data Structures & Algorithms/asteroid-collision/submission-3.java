class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int size = asteroids.length;
        if(size <= 1){
            return asteroids;
        }
        Stack<Integer> stack = new Stack<>();
        stack.add(asteroids[0]);
        for(int i = 1; i < size; i ++){
            while(doAction(stack, asteroids[i])){

            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

    public boolean doAction(Stack<Integer> stack, int i){
        if(!stack.isEmpty()){
            if(stack.peek() < 0 || Math.signum(stack.peek()) == Math.signum(i)){
                stack.add(i);
            }
            else if(Math.abs(stack.peek()) == Math.abs(i)){
                stack.pop();
            }
            else{
                if(Math.abs(stack.peek()) < Math.abs(i)){
                    stack.pop();
                    return true;
                }
            }
        }
        else{
            stack.add(i);
        }
        return false;
    }
}