import java.util.Arrays;

public class NumberOfIncreasingPathInAGrid {
    int mod = (int) Math.pow(10, 9) + 7;

    public int helper(int i, int j, int[][] grid, int[][] dp, int parent) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] <= parent) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = helper(i + 1, j, grid, dp, grid[i][j]) % mod;
        int up = helper(i - 1, j, grid, dp, grid[i][j]) % mod;
        int right = helper(i, j + 1, grid, dp, grid[i][j]) % mod;
        int left = helper(i, j - 1, grid, dp, grid[i][j]) % mod;

        return dp[i][j] = (down + up + right + left + 1) % mod;
    }

    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == -1) {
                    helper(i, j, grid, dp, -1);
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = (ans + dp[i][j]) % mod;
            }
        }
        return (int) ans;
    }

}
