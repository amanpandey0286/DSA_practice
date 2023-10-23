// bruteforce - with using additional matrix
class Solution {
    public void rotate(int[][] matrix) {
        int n  = matrix.length;
        int[][] ans = new int[n][n];
        for(int r = 0; r < n; r++){
            for(int c = 0;  c < n; c++){
                ans[r][c] =  matrix[n -1 -c][r];   
            }
        }
        for(int r  = 0; r< n; r++){
            for(int c = 0; c < n; c++){
                matrix[r][c] = ans[r][c];
            }
        }
    }
}

// optimal - without using extra space
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //for transpose
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int x = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = x;
            }
        }
        //for reverse
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int y = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = y;
            }
        }
        
    }
}


//https://leetcode.com/problems/rotate-image/
