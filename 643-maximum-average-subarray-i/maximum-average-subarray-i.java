class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double windowSum=0;

        //for first window
        for(int i=0;i<k;i++){
            windowSum += nums[i];
        } 
        double maxSum=windowSum;
        //sliding the window
        for(int i=k;i<n;i++){
            windowSum += nums[i] - nums[i-k];
            maxSum= Math.max(maxSum,windowSum);
        }
        return maxSum/k;

    }
}