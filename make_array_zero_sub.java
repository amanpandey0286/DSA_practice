class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        while(nums[nums.length - 1] > 0){
            count++;
            int minm = Integer.MAX_VALUE;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    minm = Math.min(minm, nums[i]);
                }
            }
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[i] = nums[i] - minm;
                }
            }
            Arrays.sort(nums);
        }

        return count;
    }
}

//https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
