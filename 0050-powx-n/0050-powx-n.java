class Solution {
    public double myPow(double x, int n) {
        // Fix 3: Cast to long to prevent Integer.MIN_VALUE overflow
        long N = n; 
        
        // Fix 1: Check if the exponent N is negative (NOT x)
        if (N < 0) {
            N = N * -1;
            x = 1 / x;
        }
        
        double result = 1;
        // Fix 2: Using the safe long N for the loop condition
        while (N != 0) {
            if (N % 2 != 0) {
                result = result * x;
            }
            x = x * x;
            N = N / 2;
        }
        return result;
    }
}
