class Solution {
    public boolean isSubsequence(String s, String t) {
        // An empty string is always a subsequence of any string
        if (s.isEmpty()) {
            return true;
        }
        
        int sPointer = 0;
        int tPointer = 0;
        
        // Traverse both strings
        while (tPointer < t.length()) {
            // If characters match, move the pointer for s
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            
            // If all characters in s are matched, we are done
            if (sPointer == s.length()) {
                return true;
            }
            
            // Always move the pointer for t
            tPointer++;
        }
        
        return false;
    }
}
