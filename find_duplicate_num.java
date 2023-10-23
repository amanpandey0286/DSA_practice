//less optimal - using hashset
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                ans = nums[i];
            }else{
                set.add(nums[i]);
            }
        }

        return ans;
    }
}

//https://leetcode.com/problems/find-the-duplicate-number/description/
