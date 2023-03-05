public class MinimumFallingPathSumII {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[n][n];
        for (int j = 0; j < n; j++)
            dp[n - 1][j] = matrix[n - 1][j];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int nextRow = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (k == j)
                        continue;
                    int cost = matrix[i][j] + dp[i + 1][k];
                    nextRow = Math.min(nextRow, cost);
                }

                dp[i][j] = nextRow;
            }
        }

        for (int j = 0; j < n; j++)
            ans = Math.min(ans, dp[0][j]);
        return ans;
    }

}

/*
 * Memoised solution
 * public int minFallingPathSum(int[][] grid) {
 * int n= grid.length;
 * int min =Integer.MAX_VALUE;
 * int dp[][] = new int[n][n];
 * for(int i=0;i<n;i++)
 * min = Math.min(helper(grid,n-1,i,n,dp),min);
 * return min;
 * }
 * private int helper(int[][] grid, int i, int j, int n, int[][] dp)
 * {
 * if(i==0 && (j>=0 && j<n))
 * return grid[i][j];
 * if(j<0 || j>=n)
 * return 9999;
 * // int s = grid[i][j]+helper(grid,i-1,j,n);
 * if(dp[i][j]!=0)
 * return dp[i][j];
 * int ld = grid[i][j]+helper(grid,i-1,j-1,n,dp);
 * int rd = grid[i][j]+helper(grid,i-1,j+1,n,dp);
 * return dp[i][j]=Math.min(ld,rd);
 * }
 */
