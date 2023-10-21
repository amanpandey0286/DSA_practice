class Solution {
    public boolean divideArray(int[] nums) {
        boolean flag = true;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] == nums[i+1]){
                i++;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}

//https://leetcode.com/problems/divide-array-into-equal-pairs/
