class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        int size = nums.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int index = 0;
        while(index < k){
            arr[index++] = pq.poll()[0];
        }

        return arr;
    }
}
