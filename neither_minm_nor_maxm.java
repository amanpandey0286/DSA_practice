class Solution {
    public int findNonMinOrMax(int[] nums) {
        int maxn = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            maxn = Math.max(maxn , nums[i]);
            minn = Math.min(minn , nums[i]);
        }
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != maxn && nums[i] != minn){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
//https://leetcode.com/problems/neither-minimum-nor-maximum/
