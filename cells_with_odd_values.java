class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int i = 0; i < indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j = 0; j < n; j++){
                matrix[r][j] = matrix[r][j]+1;
            }
            for(int k = 0; k < m; k++){
                matrix[k][c] = matrix[k][c]+1;
            }
        }
        int count =0;
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                int num = matrix[i][j];
                if(num%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
