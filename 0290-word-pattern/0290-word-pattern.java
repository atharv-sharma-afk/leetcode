class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        Map<Object, Integer> map = new HashMap<>();
        
        for (Integer i = 0; i < pattern.length(); i++) {
            
            Object charKey = pattern.charAt(i);
            Object wordKey = words[i];
            
            if (!java.util.Objects.equals(map.put(charKey, i), map.put(wordKey, i))) {
                return false;
            }
        }
        
        return true;
    }
}