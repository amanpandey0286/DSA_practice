class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j  = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    int z1 = Math.abs(arr[i] - arr[j]);
                    int z2 = Math.abs(arr[j] - arr[k]);
                    int z3 = Math.abs(arr[i] - arr[k]);
                    if(z1 <= a && z2 <= b && z3 <= c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/count-good-triplets/
