class Solution {
    public int maxProfit(int[] prices) {
        int maxSoFar = prices[0];
        int res = 0;

        for(int i=0; i < prices.length; i++){
            maxSoFar = Math.min(maxSoFar, prices[i]);

            res = Math.max(res, prices[i] - maxSoFar);
        }
        return res;
    }
}