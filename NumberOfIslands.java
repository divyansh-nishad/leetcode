public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] marked = new boolean[m][n];
        int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        int islandCount = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (!marked[i][j] && grid[i][j] == '1') {
                    bfs(i, j, grid, marked, direction);
                    ++islandCount;
                }
            }
        }
        return islandCount;
    }

    private void bfs(int i, int j, char[][] grid, boolean[][] marked, int[][] direction) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { i, j });
        marked[i][j] = true;
        // bfs
        while (queue.size() > 0) {
            int[] curr = queue.poll();
            for (int[] dir : direction) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n) {
                    if (!marked[x][y] && grid[x][y] == '1') {
                        queue.offer(new int[] { x, y });
                        marked[x][y] = true;
                    }
                }
            }
        }
    }

}
