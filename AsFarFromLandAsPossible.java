public class AsFarFromLandAsPossible {
    public int maxDistance(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    continue;
                }
                grid[i][j] = 201;
                if (i > 0)
                    grid[i][j] = Math.min(grid[i][j], grid[i - 1][j] + 1);
                if (j > 0)
                    grid[i][j] = Math.min(grid[i][j], grid[i][j - 1] + 1);

            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (grid[i][j] == 1)
                    continue;
                if (i < n - 1)
                    grid[i][j] = Math.min(grid[i][j], grid[i + 1][j] + 1);
                if (j < m - 1)
                    grid[i][j] = Math.min(grid[i][j], grid[i][j + 1] + 1);
                res = Math.max(res, grid[i][j]);
            }
        }
        return res == 201 ? -1 : res - 1;

    }

}
