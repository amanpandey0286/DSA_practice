class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int left = 0; 
        int right = column -1 ; 
        int top = 0;
        int down = rows - 1 ;
        
        Stack <Integer> s = new Stack<Integer>();
       //right
        while(top <= down && left <= right){
            for(int i  =  left ; i <= right; i++){
            s.add(matrix[top][i]);
        }
        top++;
        //down
        for(int i = top; i<= down; i++){
            s.add(matrix[i][right]);
        }
        right --;
        if(top <= down){
            // left
            for(int i = right; i>= left;i--){
                s.add(matrix[down][i]);
            }
            down--;
        }
        if(left <= right){
           //top 
            for(int i = down; i >= top; i--){
                s.add(matrix[i][left]);
            }
            left++;
        }
        }
        

        return s;
    }
}

//https://leetcode.com/problems/spiral-matrix/description/
