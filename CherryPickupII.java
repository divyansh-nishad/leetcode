public class CherryPickupII {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n][m][m];
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2)
                    dp[n - 1][j1][j2] = grid[n - 1][j1];
                else
                    dp[n - 1][j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    int maxi = Integer.MIN_VALUE;

                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {

                            int ans;

                            if (j1 == j2)
                                ans = grid[i][j1];
                            else
                                ans = grid[i][j1] + grid[i][j2];

                            if ((j1 + di < 0 || j1 + di >= m) || (j2 + dj < 0 || j2 + dj >= m))

                                ans += (int) Math.pow(-10, 9);
                            else
                                ans += dp[i + 1][j1 + di][j2 + dj];

                            maxi = Math.max(ans, maxi);
                        }
                    }
                    dp[i][j1][j2] = maxi;
                }
            }
        }

        return dp[0][0][m - 1];
    }

    // public int cherryPickup(int[][] grid) {
    // int n = grid.length;
    // int m = grid[0].length;
    // int dp[][][] = new int[n][m][m];
    // for (int row1[][] : dp) {
    // for (int row2[] : row1) {
    // Arrays.fill(row2, -1);
    // }
    // }
    // return helper(grid, 0, 0, m - 1, n, m, dp);
    // }

    // private int helper(int[][] grid, int i, int j1, int j2, int n, int m, int
    // dp[][][]) {
    // if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
    // return (int) -1e8;
    // if (i == n - 1) {
    // if (j1 == j2)
    // return grid[i][j1];
    // else {
    // return grid[i][j1] + grid[i][j2];
    // }
    // }
    // if (dp[i][j1][j2] != -1)
    // return dp[i][j1][j2];
    // int maxi = (int) -1e8;
    // for (int dj1 = -1; dj1 <= 1; dj1++) {
    // for (int dj2 = -1; dj2 < 2; dj2++) {
    // if (j1 == j2)
    // maxi = Math.max(maxi, grid[i][j1] + helper(grid, i + 1, j1 + dj1, j2 + dj2,
    // n, m, dp));
    // else
    // maxi = Math.max(maxi,
    // grid[i][j2] + grid[i][j1] + helper(grid, i + 1, j1 + dj1, j2 + dj2, n, m,
    // dp));

    // }
    // }
    // return dp[i][j1][j2] = maxi;
    // }

}
