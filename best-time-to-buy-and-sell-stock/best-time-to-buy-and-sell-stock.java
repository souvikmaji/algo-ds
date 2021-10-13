class Solution {
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length];
        int minSoFar = prices[0];
        
        for (int i = 1; i < prices.length; i ++){
            minSoFar = Math.min(minSoFar, prices[i]);
            
            if(prices[i] > prices[i-1]){
                profit[i] = prices[i] - minSoFar;
            }
        }
        
        int maxProfit = 0;
        for(int i = 0; i < profit.length; i++){
            maxProfit = Math.max(maxProfit, profit[i]);
        }
        
        return maxProfit;
    }
}