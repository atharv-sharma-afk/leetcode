class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magCount = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            magCount.put(c, magCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (magCount.getOrDefault(c, 0) <= 0) {
                return false;
            }
            magCount.put(c, magCount.getOrDefault(c, 0) - 1);
        }
        
        return true;
    }
}