class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int[n][n];
        int count = 1, top = 0 , left = 0;
        int right = n -1, bottom = n -1;
        while( top <= bottom && left <= right){
            for(int i = left; i <= right; i++ ){
                arr[top][i] = count;
                count++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                arr[i][right] = count;
                count++;
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    arr[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top;i--){
                    arr[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return arr;
          
    }
}

//https://leetcode.com/problems/spiral-matrix-ii/description/
