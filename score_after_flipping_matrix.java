public class score_after_flipping_matrix {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0)
                flipRow(grid, i);
        }
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += grid[j][i];
            }
            if (sum * 2 < m)
                flipCol(grid, i);

        }
        int total = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += grid[i][j] * (1 << (n - j - 1));
            }
        }
        return total;
    }

    private void flipRow(int[][] a, int r) {
        for (int i = 0; i < a[r].length; ++i)
            a[r][i] = (a[r][i] ^ 1);
    }

    private void flipCol(int[][] a, int c) {
        for (int i = 0; i < a.length; ++i)
            a[i][c] = (a[i][c] ^ 1);
    }

}
