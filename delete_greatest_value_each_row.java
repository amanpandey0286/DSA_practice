class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            Arrays.sort(grid[i]);
        }
        int sum = 0;
        for(int i = m -1; i >=0; i-- ){
            int maxm = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++){
                maxm = Math.max(maxm, grid[j][i]);
            }
            sum += maxm;
        }
        return sum;
    }
} 

//https://leetcode.com/problems/delete-greatest-value-in-each-row/
