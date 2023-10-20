class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
        }
        System.out.println(sum);
        for(int i = 0; i < mat.length; i++ ){
            sum += mat[i][mat.length -1 -i];
        }
        if((mat.length%2) != 0){
            int z = mat.length/2;
            sum -= mat[z][z];
        }

        return sum;
    }
}

//https://leetcode.com/problems/matrix-diagonal-sum/
