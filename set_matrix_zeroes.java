class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] dup = new int [matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                dup[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0;j < matrix[i].length; j++){
                if(dup[i][j] == 0){
                    for(int c = matrix.length -1; c >= 0; c--){
                        matrix[c][j] = 0;
                    }
                    for(int r = (matrix[i].length -1); r >= 0; r--){
                        matrix[i][r] = 0;
                    }
                }
            }
        }
    }
}

//https://leetcode.com/problems/set-matrix-zeroes/
