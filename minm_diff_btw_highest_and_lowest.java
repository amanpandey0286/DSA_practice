//brute force approach.

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int maxm = nums[0];
        int minm = nums[0];
        int minmDiff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+k-1; j < nums.length ; j++){
                maxm = nums[j];
                minm = nums[i];
                minmDiff = Math.min(maxm - minm, minmDiff);
            }

        }
        return minmDiff;
    }
}

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
