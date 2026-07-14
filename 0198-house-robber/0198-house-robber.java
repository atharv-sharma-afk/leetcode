class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int rob1 = 0; // Max loot accumulated up to 2 houses ago (i - 2)
        int rob2 = 0; // Max loot accumulated up to 1 house ago (i - 1)
        
        for (int num : nums) {
            // At the current house, do we get more money by robbing it (num + rob1)
            // or by skipping it and keeping our previous best (rob2)?
            int currentMax = Math.max(num + rob1, rob2);
            
            // Shift our variables forward for the next house in line
            rob1 = rob2;
            rob2 = currentMax;
        }
        
        // When the loop ends, rob2 holds the maximum possible loot for the entire street
        return rob2;
    }
}