// easiest approach

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = n;
        for(int i = 0; i <= n ; i++){
            if(i < n){
                if( i != nums[i]){
                    return i;
                }
            }
        }

        return ans;
    }
}

//better approach
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        int l = nums.length;
        int realSum = (l*(l+1))/2;
        int reqNo = realSum - sum;
        return reqNo;
    }
}

//https://leetcode.com/problems/missing-number/description/
