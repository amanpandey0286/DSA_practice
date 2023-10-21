class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] sol = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            HashSet<Integer> prefSet = new HashSet<>();
            for(int p = 0; p <= i; p++){
                prefSet.add(nums[p]);
            }
            HashSet<Integer> suffSet = new HashSet<>();
            for(int s = i+1; s < nums.length; s++){
                suffSet.add(nums[s]);
            }
            sol[i] = prefSet.size() - suffSet.size();
        }
        return sol;
    }
}

//https://leetcode.com/problems/find-the-distinct-difference-array/
