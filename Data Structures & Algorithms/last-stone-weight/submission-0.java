class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        for(int i : stones){
            maxHeap.offer(i);
        }
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            int temp = Math.abs(x-y);
            if(temp != 0){
                maxHeap.offer(temp);
            }
        }
        if(maxHeap.size() == 1){
            return maxHeap.poll();
        }
        return 0;
    }
}
