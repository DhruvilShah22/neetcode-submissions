class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;
        if(size == k){
            return Arrays.stream(arr).boxed().collect(Collectors.toList());
        }
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < k; i ++){
            queue.offer(arr[i]);
        }

        for(int i = k; i < size; i ++){
            if(Math.abs(arr[i] - x) < Math.abs(queue.peek() - x)){
                queue.poll();
                queue.offer(arr[i]);
            }
        }

        return queue.stream().collect(Collectors.toList());
    }
}