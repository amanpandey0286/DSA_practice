class Solution {
    public int sumOfUnique(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int sum = 0;
        if(nums[0] != nums[1]){
                sum += nums[0];
        }
        for(int i = 1; i < nums.length -1; i++){
            
            if((nums[i] != nums[i+1])&&(nums[i-1] != nums[i])){
                sum += nums[i];
            }
        }
        if(nums[nums.length -2] != nums[nums.length -1]){
                sum += nums[nums.length-1];
        }
        return sum;
    }
}

//https://leetcode.com/problems/sum-of-unique-elements/
