class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            int n = nums[i];
            while(n>0){
                int m = n%10;
                list.add(0, m);
                n = n/10;
            }
        }

        int[] newNum = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            newNum[i] = list.get(i);
        }

        return newNum;
    }
}

//https://leetcode.com/problems/separate-the-digits-in-an-array/
