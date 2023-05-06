class Solution {
    public int maxProfit(int[] prices) {
        int minSofar = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length ; i++){
            minSofar = Math.min(minSofar , prices[i]);
            int newProfit  =  prices[i] - minSofar;
            profit = Math.max(profit, newProfit);
        }

        return profit;
    }
}

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
