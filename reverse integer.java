class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            // "Pop" the last digit off x
            int pop = x % 10;
            x /= 10;
            
            // Check for overflow/underflow BEFORE multiplying rev by 10
            // Integer.MAX_VALUE is  2147483647
            // Integer.MIN_VALUE is -2147483648
            
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Positive overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Negative underflow
            }
            
            // "Push" the digit onto the back of the reversed number
            rev = (rev * 10) + pop;
        }
        
        return rev;
    }
}
