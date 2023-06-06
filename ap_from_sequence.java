class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i+2 < arr.length; i++ ){
            if((arr[i+2] - arr[i+1]) != (arr[i+1] - arr[i])){
                return false;
            }
        }

        return true;
    }
}

//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/description/
