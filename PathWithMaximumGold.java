public class PathWithMaximumGold {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, helper(grid, m, n, i, j));
            }
        }
        return max;
    }

    int[] di = { 1, 0, 0, -1 };
    int[] dj = { 0, -1, 1, 0 };

    private int helper(int[][] grid, int m, int n, int i, int j) {
        if (i < 0 || j < 0 || i == m || j == n || grid[i][j] == 0)
            return 0;
        int cur = grid[i][j];
        int max = 0;
        grid[i][j] = 0;
        for (int li = 0; li < 4; li++) {
            max = Math.max(max, helper(grid, m, n, i + di[li], j + dj[li]));
        }
        grid[i][j] = cur;
        return max + cur;
    }

}
