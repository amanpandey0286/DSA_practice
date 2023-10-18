class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            exp[i] = heights[i];
        }
        Arrays.sort(exp);
        int count = 0; 
        for(int i = 0; i < exp.length; i++){
            if(exp[i] != heights[i]){
                count++;
            }
        }

        return count;
    }
}

//https://leetcode.com/problems/height-checker/
