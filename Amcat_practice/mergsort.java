import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 1. Copy all elements of nums2 into the empty tail of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        
        Arrays.sort(nums1);
    }
}