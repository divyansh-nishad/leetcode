public class SodokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isSafe(board, i, j, ch)) {
                            board[i][j] = ch;
                            if (solve(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }

                    }
                    return false;
                }

            }
        }
        return true;
    }

    private boolean isSafe(char[][] board, int i, int j, char ch) {
        for (int n = 0; n < 9; n++) {
            if (board[n][j] != '.' && board[n][j] == ch)
                return false;
            if (board[i][n] != '.' && board[i][n] == ch)
                return false;
            if (board[3 * (i / 3) + n / 3][3 * (j / 3) + n % 3] != '.' &&
                    board[3 * (i / 3) + n / 3][3 * (j / 3) + n % 3] == ch)
                return false;
        }
        return true;
    }

}
