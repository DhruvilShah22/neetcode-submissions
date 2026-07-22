class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> dq = new ArrayDeque<>();

        for(String i : tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int x = dq.removeFirst();
                int y = dq.removeFirst();
                if(i.equals("+")){
                    dq.addFirst(x + y);
                }
                else if(i.equals("-")){
                    dq.addFirst(y - x);
                }
                else if(i.equals("*")){
                    dq.addFirst(y * x);
                }
                else {
                    dq.addFirst(y / x);
                }
            }
            else{
                dq.addFirst(Integer.valueOf(i));
            }
        }

        return Integer.valueOf(dq.removeFirst());
    }
}
