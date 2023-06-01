public class ShortestPathInBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        int[][] directions = {
                { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { 0, 0 });
        grid[0][0] = 1;

        int pathLength = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            pathLength++;
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                if (row == n - 1 && col == n - 1) {
                    return pathLength;
                }
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                        queue.offer(new int[] { newRow, newCol });
                        grid[newRow][newCol] = 1;
                    }
                }
            }
        }
        return -1;
    }

}
