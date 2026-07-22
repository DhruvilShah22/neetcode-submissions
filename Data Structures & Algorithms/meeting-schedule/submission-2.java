/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int size = intervals.size();
        if(size <= 1){
            return true;
        }
        intervals.sort(Comparator.comparing(i -> i.start));
        Interval prev = intervals.get(0);

        for(int i = 1; i < size; i ++){
            Interval curr = intervals.get(i);
            if(curr.start < prev.end){
                return false;
            }
            prev = curr;
        }

        return true;
    }
}
