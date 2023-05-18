class Solution {
    public int[] productExceptSelf(int[] nums) {
        // result[i] =  product of all left * product of all right.
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
         
        //storing left product
        left[0] = 1;
        for(int i = 1 ; i < left.length; i++){
            left[i] = left[i-1]*nums[i-1];
        } 
         
        //storing right product
        right[right.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i-- ){
            right[i] = right[i +1]*nums[i+1];
        }

        int[] ans  = new int[left.length];
        for(int i = 0; i < left.length; i++){
            ans[i] = left[i]*right[i];
        }

        return ans;
    }
}

//https://leetcode.com/problems/product-of-array-except-self/description/
