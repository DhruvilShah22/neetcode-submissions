class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        if(size == 1){
            return cost[0];
        }

        int i1 = cost[0];
        int i2 = cost[1];

        for(int i = 2; i < size; i++){
            int temp = Math.min(i1, i2) + cost[i];
            i1 = i2;
            i2 = temp;
        }

        return Math.min(i1, i2);
    }
}
