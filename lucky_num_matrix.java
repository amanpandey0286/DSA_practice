class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                boolean flag = true;
                int n = matrix[i][j];
                for(int r = 0; r < matrix[i].length; r++){
                    if(matrix[i][r] < n){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    for(int c = 0; c < matrix.length; c++){
                        if(matrix[c][j] > n){
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag == true){
                    list.add(n);
                }
            }
        }
        return list;
    }
}

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
