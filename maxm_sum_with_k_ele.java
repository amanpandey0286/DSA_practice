class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int score = 0;
        while(k-->0){
            int m = nums[nums.length - 1];
            score += m;
            nums[nums.length - 1] = m+1;
        }

        return score;
    }
}

//https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/
