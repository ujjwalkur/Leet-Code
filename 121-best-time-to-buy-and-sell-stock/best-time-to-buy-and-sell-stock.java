class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;
        
        for(int i = 0; i< prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            
            max = prices[i] - min;
            if(profit < max){
                profit = max;
            }
        }
        return profit;
    }
}