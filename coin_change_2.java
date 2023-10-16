class Solution {
    public int comb(int amount, int[] coins, int n){
        int[][] memo = new int[amount + 1][n+1];
        for(int i = 0; i <= n; i++){
            memo[0][i] = 1;
        }
        for(int i = 0; i <= amount; i++){
            memo[i][0] = 0;
        }
        for(int i = 1; i < memo.length; i++){
            for(int j = 1; j < memo[i].length; j++ ){
                memo[i][j] = memo[i][j-1];
                if(coins[j -1] <= i){
                    memo[i][j] += memo[i - coins[j - 1]][j];
                }
            }
        }
        return memo[amount][n];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;

        return comb(amount , coins, n);
    }
}

//https://leetcode.com/problems/coin-change-ii/
