class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int maxi = 0;
        if(size == 1){
            return maxi;
        }
        int mini = prices[0];
        for(int i = 1; i < size; i ++){
            if(mini > prices[i]){
                mini = prices[i];
            }
            else{
                maxi = Math.max(maxi, prices[i] - mini);
            }
        }
        return maxi;
    }
}
