class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];

            if(currSum > maxSum) {
                maxSum = currSum;
            }

            if(currSum < 0) { // if the curr sum becomes negative, it indicates that including the curr element in the subarray would reduce the overall sum. In such cases, we reset currSum to 0.
                currSum = 0;
            }
        }
        return maxSum;
    }
}