class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            minHeap.add(i);
        }
        int index = 0;

        while(!minHeap.isEmpty()){
            nums[index++] = minHeap.poll();
        }
        return nums;
    }
}