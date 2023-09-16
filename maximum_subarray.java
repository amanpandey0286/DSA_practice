// KADANE'S ALGORITHM

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            maxSum = Math.max(sum , maxSum);
            // if sum becomes negative so it is of no use
            if(sum <= 0){
                sum = 0;
            }
        } 
        return maxSum;

    }
}


//https://leetcode.com/problems/maximum-subarray/description/
