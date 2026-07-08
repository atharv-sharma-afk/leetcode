class Solution {
    public String sortVowels(String s) {
        // Step 1: Create a frequency array for the 10 vowels sorted by ASCII value
        // ASCII order: A(65), E(69), I(73), O(79), U(85), a(97), e(101), i(105), o(111), u(117)
        String sortedVowelsStr = "AEIOUaeiou";
        int[] vowelCounts = new int[128]; // Store frequencies using ASCII values as indices
        
        char[] chars = s.toCharArray();
        
        // Step 2: Count frequencies of all vowels present in the string
        for (char c : chars) {
            if (isVowel(c)) {
                vowelCounts[c]++;
            }
        }
        
        // Step 3: Reconstruct the string by replacing old vowels with sorted ones
        int vowelPointer = 0; // Tracks our position in sortedVowelsStr
        
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                // Find the next available vowel in ASCII order
                while (vowelCounts[sortedVowelsStr.charAt(vowelPointer)] == 0) {
                    vowelPointer++;
                }
                
                // Replace the character and decrement its remaining count
                char nextVowel = sortedVowelsStr.charAt(vowelPointer);
                chars[i] = nextVowel;
                vowelCounts[nextVowel]--;
            }
        }
        
        return new String(chars);
    }
    
    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}