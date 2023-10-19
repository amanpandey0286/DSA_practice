class Solution {
    public int differenceOfSum(int[] nums) {
        int s= nums.length;
        int elsum = 0;
        int disum = 0;
        for(int i = 0; i < s; i++){
            elsum += nums[i];
        }
        for(int i = 0; i < s; i++){
            int n = nums[i];
            if(n != 0){
                while(n > 0){
                    int d = n%10;
                    n = n/10;
                    disum += d;
                }
            }
        }
       

        int ans = Math.abs(elsum - disum);
        return ans;
    }
}

//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
