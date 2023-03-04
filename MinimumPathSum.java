public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        int cur = 0;
        for (int i = 0; i < m; i++) {
            dp[i][0] = cur + grid[i][0];
            cur = dp[i][0];
        }
        cur = 0;
        for (int j = 0; j < n; j++) {
            dp[0][j] = cur + grid[0][j];
            cur = dp[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m - 1][n - 1];
    }

}
