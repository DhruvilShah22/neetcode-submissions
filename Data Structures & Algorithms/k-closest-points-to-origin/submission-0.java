
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );

        for (int i = 0; i < points.length; i++) {
            long x = points[i][0];
            long y = points[i][1];

            long distSq = (x * x) + (y * y);
            pq.add(new long[]{distSq, i});
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            long[] top = pq.poll();
            int index = (int) top[1];
            ans[i] = points[index];
        }
        
        return ans;
    }
}
