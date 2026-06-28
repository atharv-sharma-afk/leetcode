class Solution {
    public double myPow(double x, int n) {
        long N = n; // Cast to long to handle Integer.MIN_VALUE safely
        if (N < 0) {
            return 1.0 / fastPow(x, -N);
        }
        return fastPow(x, N);
    }
    
    private double fastPow(double x, long n) {
        // Base case
        if (n == 0) {
            return 1.0;
        }
        
        // Recursive call for half the power
        double half = fastPow(x, n / 2);
        
        // If power is even: x^n = (x^(n/2)) * (x^(n/2))
        if (n % 2 == 0) {
            return half * half;
        } else {
            // If power is odd: x^n = x * (x^(n/2)) * (x^(n/2))
            return half * half * x;
        }
    }
}