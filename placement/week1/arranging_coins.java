class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n>=i){
                n=n-i%n;
                count+=1;
            }
        }return count;
}
}

//solution 2:
class Solution {
    public int arrangeCoins(int n) {
        long k = 0;
        while (k * (k + 1) / 2 <= n) {
            k++;
        }
        return (int) (k - 1);
    }
}