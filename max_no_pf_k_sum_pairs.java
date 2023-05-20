class Solution {
    public int maxOperations(int[] nums, int k) {
        int start = 0;
        int last =  nums.length - 1;
        int count = 0;
        Arrays.sort(nums);
        while(start < last){
            // if equall then move both pointers and increase counters.
            if(nums[start] + nums[last] == k){
                start++;
                last--;
                count++;
              
            // if sum is less then move toward bigger no. -> move start pointer forward.
            }else if(nums[start] + nums[last] < k ){
                start++;
              
            // if summ is bigger the move toward small no. -> move last pointer backward.
            }else{
                last--;
            }   
        }
        return count ;
    }
}

//https://leetcode.com/problems/max-number-of-k-sum-pairs/description/
