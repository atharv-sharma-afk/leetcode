class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int sPointer=0;
        int tPointer= 0;
        while(tPointer<=t.length()-1){
            if(s.charAt(sPointer)==t.charAt(tPointer)){
                sPointer++;
                tPointer++;
            }else{
                tPointer++;
            }
            if(sPointer==s.length()){
                return true;
            }

        }return false;
}
}
