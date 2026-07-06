class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxEnding = 0;
        int minEnding = 0;
        int globMax = nums[0];
        int globMin = nums[0];

        for (int num : nums) {
            totalSum += num;
            
            // Standard Kadane's to find max subarray
            maxEnding = Math.max(maxEnding + num, num);
            globMax = Math.max(globMax, maxEnding);
            
 
            minEnding = Math.min(minEnding + num, num);
            globMin = Math.min(globMin, minEnding);
        }

        if (globMax < 0) {
            return globMax;
        }

        return Math.max(globMax, totalSum - globMin);
    }
}