class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int size = intervals.length;
        if(size <= 1){
            return 0;
        }
        int[] dp = new int[size];
        dp[0] = 1;

        for(int i = 1; i < size; i ++){
            if(intervals[i-1][1] > intervals[i][0]){
                int j = i - 1;
                while(j >= 0 && intervals[j][1] > intervals[i][0]){
                    j--;
                }
                if(j >= 0){
                    dp[i] = dp[j] + 1;
                }
                else{
                    dp[i] = 1;
                }
            }
            else{
                dp[i] = dp[i-1] + 1;
            }
        }
        return size - dp[size - 1];
    }
}
