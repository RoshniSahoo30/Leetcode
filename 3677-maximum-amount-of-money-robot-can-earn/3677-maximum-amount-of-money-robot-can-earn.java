class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        
        // dp[i][j][k] represents max coins at position (i,j) with k neutralizations used
        int[][][] dp = new int[m][n][3];
        
        // Initialize with minimum value to handle negative paths
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }
        dp[0][0][0] = coins[0][0];
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    if (dp[i][j][k] == Integer.MIN_VALUE) continue;
                    
                    // Try moving right
                    if (j + 1 < n) {
                        // Without neutralization
                        dp[i][j+1][k] = Math.max(dp[i][j+1][k], 
                                               dp[i][j][k] + coins[i][j+1]);
                        
                        // With neutralization if we have any left and current cell is negative
                        if (k < 2 && coins[i][j+1] < 0) {
                            dp[i][j+1][k+1] = Math.max(dp[i][j+1][k+1], 
                                                     dp[i][j][k]);
                        }
                    }
                    
                    // Try moving down
                    if (i + 1 < m) {
                        // Without neutralization
                        dp[i+1][j][k] = Math.max(dp[i+1][j][k], 
                                               dp[i][j][k] + coins[i+1][j]);
                        
                        // With neutralization if we have any left and current cell is negative
                        if (k < 2 && coins[i+1][j] < 0) {
                            dp[i+1][j][k+1] = Math.max(dp[i+1][j][k+1], 
                                                     dp[i][j][k]);
                        }
                    }
                }
            }
        }
         int result = Integer.MIN_VALUE;
        for (int k = 0; k < 3; k++) {
            result = Math.max(result, dp[m-1][n-1][k]);
        }
        return result;
    }
}