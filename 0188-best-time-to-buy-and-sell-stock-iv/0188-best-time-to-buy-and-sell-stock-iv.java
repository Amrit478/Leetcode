class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;
        
        // If k is greater than n/2, we can treat it as unlimited transactions
        if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }
        
        // DP array
        int[][] dp = new int[k + 1][n];
        
        for (int t = 1; t <= k; t++) {
            int maxDiff = -prices[0]; // This will store the maximum of dp[t-1][j] - prices[j]
            for (int d = 1; d < n; d++) {
                dp[t][d] = Math.max(dp[t][d - 1], prices[d] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t - 1][d] - prices[d]);
            }
        }
        
        return dp[k][n - 1];
    }
}