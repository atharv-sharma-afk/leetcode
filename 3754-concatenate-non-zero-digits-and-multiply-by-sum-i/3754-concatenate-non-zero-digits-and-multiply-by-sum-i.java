class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long x=0;
        long sum= 0;
        for(int i=0;i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch != '0'){
                int digit= ch-'0';
                sum+= digit ;
                x=x*10+digit;
            }

        }return sum*x;
}
}