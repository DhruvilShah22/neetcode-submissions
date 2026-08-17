class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedList = new ArrayList<>();
        int size = intervals.length;
        int index = 0;
        if(size == 0){
            mergedList.add(newInterval);
        }
        else{
            while(index < size && intervals[index][1] < newInterval[0]){
                mergedList.add(intervals[index++]);
            }
            
            for(; index < size; index++){
                if(intervals[index][0] > newInterval[1] && intervals[index][1] > newInterval[1]){
                    mergedList.add(newInterval);
                    break;
                }
                else{
                    newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
                    newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
                }
            }
            if(index >= size){
                mergedList.add(newInterval);
            }

            while(index < size){
                mergedList.add(intervals[index++]);
            }
        }

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
