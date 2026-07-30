class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int totalPushes = 0;
        int pushesPerChar = 1;
        
        // Process every group of 8 characters
        for (int i = 0; i < n; i++) {
            if (i > 0 && i % 8 == 0) {
                pushesPerChar++;
            }
            totalPushes += pushesPerChar;
        }
        
        return totalPushes;
    }
}