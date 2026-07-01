class Solution {
    public int[] sortArray(int[] nums) {
        // Base case: arrays with 0 or 1 element are already sorted
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        
        // Start the recursive merge sort process
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        // Base case: stop when the segment has only one element
        if (left >= right) {
            return;
        }

        // Find the middle point to split the array
        int mid = left + (right - left) / 2;

        // Recursively sort the left half
        mergeSort(nums, left, mid);

        // Recursively sort the right half
        mergeSort(nums, mid + 1, right);

        // Merge the two sorted halves back together
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        // Create a temporary array to hold the merged elements
        int[] temp = new int[right - left + 1];
        
        int i = left;     // Initial index for the left subarray
        int j = mid + 1;  // Initial index for the right subarray
        int k = 0;        // Initial index for the temporary array

        // Copy smallest elements from either side into temp
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j <= right) {
            temp[k++] = nums[j++];
        }

        // Copy the sorted elements from temp back into the original array
        for (i = 0; i < temp.length; i++) {
            nums[left + i] = temp[i];
        }
    }
}
