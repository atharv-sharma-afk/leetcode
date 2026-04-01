class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // 'k' is our "writer" pointer. 
        // Since the first element is always unique, we start at index 1.
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[k - 1]) {
                // Move the unique element to the 'k' position
                nums[k] = nums[i];
                // Increment k to the next available slot
                k++;
            }
        }

        // k is the count of unique elements
        return k;
    }
}