class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int windowSum = 0;
        for(int i = 0; i < k ; i++){
            windowSum = windowSum + nums[i];
        }
        // int maxAvg =windowSum/k;
        int maxSum = windowSum;
        for(int j = k; j < nums.length; j++){
            windowSum = windowSum - nums[j-k] + nums[j];
            maxSum = Math.max(maxSum,windowSum);
            // maxAvg = Math.max(maxAvg , (double)windowSum/k);
        }
        
        return (double) maxSum/k;
    }
}