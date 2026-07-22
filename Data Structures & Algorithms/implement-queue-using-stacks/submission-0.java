class MyQueue {

    private List<Integer> list;

    public MyQueue() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);    
    }
    
    public int pop() {
        return list.remove(0);
    }
    
    public int peek() {
        return list.get(0);
    }
    
    public boolean empty() {
        if(list.size() > 0){
            return false;
        }
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */