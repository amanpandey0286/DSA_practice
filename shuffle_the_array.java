class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] sh = new int[nums.length];
        int i = 0, j= 0;
        while(i < n){
            sh[j] = nums[i];
            sh[j + 1] = nums[n + i];
            i++;
            j = j+2; 
        }

        return sh;
        
    }
}

//https://leetcode.com/problems/shuffle-the-array/
