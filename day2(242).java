class Solution {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();
        s.replace(" ", "");
        t.replace(" ", "");
        int[] arr = new int[26];
        for(int i=0; i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
               
            

        }
        for(int i=0; i<t.length();i++){
            arr[t.charAt(i) - 'a']--;

        }
        for(int a: arr){
            if(a!=0){
            return false;
        }
        }
        return true;
    }
}
    


