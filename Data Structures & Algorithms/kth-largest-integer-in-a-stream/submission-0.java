class KthLargest {
    private PriorityQueue<Integer> heap;
    private int maxSize;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<Integer>();
        maxSize = k;
        for(int i : nums){
            heap.offer(i);
            if(heap.size() > k){
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size() > maxSize){
            heap.poll();
        }
        return heap.peek();
    }
}
