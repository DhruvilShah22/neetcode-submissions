class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int buyPrice = prices[0];
        int prevMax = prices[0];
        int profit = 0;
        for(int i = 1; i < size; i ++){
            if(prices[i] < buyPrice || prices[i] < prevMax){
                profit += prevMax - buyPrice;
                buyPrice = prices[i];
                prevMax = prices[i];
            }
            else if(prices[i] > prevMax){
                prevMax = prices[i];
            }
        }
        return profit + (prevMax - buyPrice);
    }
}