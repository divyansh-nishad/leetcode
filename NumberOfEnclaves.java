public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for (int j = 0; j < m; j++) {
            if (vis[0][j] == 0 && grid[0][j] == 1) {
                q.add(new Pair(0, j));
                vis[0][j] = 1;
            }
            if (vis[n - 1][j] == 0 && grid[n - 1][j] == 1) {
                q.add(new Pair(n - 1, j));
                vis[n - 1][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (vis[i][0] == 0 && grid[i][0] == 1) {
                q.add(new Pair(i, 0));
                vis[i][0] = 1;
            }
            if (vis[i][m - 1] == 0 && grid[i][m - 1] == 1) {
                q.add(new Pair(i, m - 1));
                vis[i][m - 1] = 1;
            }
        }
        int[] delRow = { -1, 0, 1, 0 };
        int[] delCol = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {

            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol));
                    vis[nrow][ncol] = 1;
                }
            }

        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == 1)
                    cnt++;
            }
        }
        return cnt;
    }

}

class Pair {
    int first;
    int second;

    Pair(int a, int b) {
        first = a;
        second = b;
    }
}