class Solution {
    public int removeElement(int[] nums, int val) {
        // This pointer tracks where the next "valid" element should go
        int k = 0; 

        for (int i = 0; i < nums.length; i++) {
            // If the current element is NOT the value we want to remove
            if (nums[i] != val) {
                // Move it to the front of the array at index k
                nums[k] = nums[i];
                // Increment k to prepare for the next valid element
                k++;
            }
        }
        
        // k represents the number of elements not equal to val
        return k;
    }
}