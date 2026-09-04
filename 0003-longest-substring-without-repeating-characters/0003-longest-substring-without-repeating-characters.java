class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> CharSet = new HashSet<>();
        int left =0;
        int maxlength=0;
        for(int right=0;right<s.length();right++){
            while(CharSet.contains(s.charAt(right))){
                CharSet.remove(s.charAt(left));
                left++;
            }CharSet.add(s.charAt(right));
            maxlength= Math.max(maxlength,right-left+1);
        }return maxlength;
    }
}