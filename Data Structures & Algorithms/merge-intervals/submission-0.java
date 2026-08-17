class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> mergedList = new ArrayList<>();
        int size = intervals.length;
        if(size <= 1){
            mergedList.add(intervals[0]);
        }
        else{
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            int[] toInsert = new int[]{intervals[0][0], intervals[0][1]};
            for(int i = 1; i < size; i ++){
                if(intervals[i][0] > toInsert[0] && intervals[i][0] > toInsert[1]){
                    mergedList.add(new int[]{toInsert[0], toInsert[1]});
                    toInsert[0] = intervals[i][0];
                    toInsert[1] = intervals[i][1];
                }
                else if(intervals[i][0] >= toInsert[0] && intervals[i][0] <= toInsert[1]){
                    toInsert[0] = Math.min(intervals[i][0], toInsert[0]);
                    toInsert[1] = Math.max(intervals[i][1], toInsert[1]);
                }
            }
            mergedList.add(new int[]{toInsert[0], toInsert[1]});
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
