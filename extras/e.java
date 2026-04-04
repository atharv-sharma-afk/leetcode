class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        // Edge case: if needle is empty, return 0
        if (m == 0) return 0;
        
        // Loop through haystack until there's no room left for the needle
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            // Check if characters match one by one
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If the entire needle was matched, return the starting index
            if (j == m) {
                return i;
            }
        }
        
        // Return -1 if no match is found
        return -1;
    }
}
