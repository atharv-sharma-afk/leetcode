public class Solution {
    public int change(int amount, int[] coins) {
        // dp[i] stores the number of combinations to make up amount i
        int[] dp = new int[amount + 1];
        
        // Base case: There is exactly 1 way to make an amount of 0 (using no coins)
        dp[0] = 1;
        
        // Outer loop iterates through each coin denomination
        for (int coin : coins) {
            // Inner loop calculates combinations for all amounts from 'coin' value to target
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        
        return dp[amount];
    }
}

