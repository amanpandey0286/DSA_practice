class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int maxCount =0; 
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j  = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
                if(count > maxCount){
                    maxCount = count;
                    ans[0] = i;
                    ans[1] = count;
                }
            }
        }
        return ans;
    }
}

//https://leetcode.com/problems/row-with-maximum-ones/
