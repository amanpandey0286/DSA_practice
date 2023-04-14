class Solution {
    public int maxProfit(int[] prices) {
        int minSofar = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            //find minm number
            minSofar = Math.min(minSofar, prices[i]);
            // find profit acc current number
            int newProfit = prices[i] - minSofar;
            //find maxm profit
            profit = Math.max(newProfit,profit);
        }
        return profit;
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
