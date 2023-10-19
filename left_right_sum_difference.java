lass Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for(int i = 0; i < n; i++){
            int left = 0;
            for(int l = 0; l < i; l++ ){
                left = left + nums[l];
            }
            leftSum[i] =left;
            int right = 0;
            for(int r = i+1; r < n; r++ ){
                right = right + nums[r];
            }
            rightSum[i] = right;

        }
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}

//https://leetcode.com/problems/left-and-right-sum-differences/
