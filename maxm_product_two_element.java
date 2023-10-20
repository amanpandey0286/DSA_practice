class Solution {
    public int maxProduct(int[] nums) {
        int maxm = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int mnum = (nums[i] - 1)*(nums[j] - 1);
                maxm = Math.max(mnum , maxm);
            }
        }
        return maxm;
    }
}

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
