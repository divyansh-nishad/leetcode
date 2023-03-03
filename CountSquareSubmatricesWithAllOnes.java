public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 1)
                dp[i][0] = 1;
        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 1)
                dp[0][j] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    int min = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    dp[i][j] = min;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                count += dp[i][j];
        }
        return count;
    }

}
