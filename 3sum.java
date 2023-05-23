class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set <List<Integer>>set =new HashSet<>();
        if(nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int first = 0;
        int last = 0;
        for(int i = 0 ; i < nums.length; i++){
            first = i+1;
            last = nums.length- 1;
            while(first < last){
                if(nums[i] + nums[first] + nums[last] == 0){
                    set.add(Arrays.asList(nums[i],nums[first], nums[last]));
                    first++;
                    last--;
                }else if(nums[i] + nums[first] + nums[last] < 0){
                    first++;
                }else{
                    last--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}

//https://leetcode.com/problems/3sum/description/
