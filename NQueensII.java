public class NQueensII {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        return helper(0, board, n);
    }

    private int helper(int row, char[][] board, int n) {
        if (row == n)
            return 1;
        else {
            int count = 0;
            for (int col = 0; col < n; col++) {
                if (isSafe(row, col, board, n)) {
                    board[row][col] = 'Q';
                    count = count + helper(row + 1, board, n);
                    board[row][col] = '.';
                }
            }
            return count;
        }
    }

    private static boolean isSafe(int row, int col, char[][] board, int n) {
        int r = row, c = col;
        while (r >= 0)
            if (board[r--][c] == 'Q')
                return false;
        r = row;
        while (r >= 0 && c >= 0)
            if (board[r--][c--] == 'Q')
                return false;
        r = row;
        c = col;
        while (r >= 0 && c < n)
            if (board[r--][c++] == 'Q')
                return false;
        return true;
    }

}
