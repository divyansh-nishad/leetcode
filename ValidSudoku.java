public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char ch = board[i][j];
                for (int n = 0; n < 9; n++) {
                    if (board[n][j] != '.' && board[n][j] == ch && n != i)
                        return false;
                    if (board[i][n] != '.' && board[i][n] == ch && n != j)
                        return false;
                    if (board[3 * (i / 3) + n / 3][3 * (j / 3) + n % 3] != '.'
                            && board[3 * (i / 3) + n / 3][3 * (j / 3) + n % 3] == ch && 3 * (i / 3) + n / 3 != i
                            && (3 * (j / 3) + n % 3) != j)
                        return false;
                }

            }
        }
        return true;
    }

}
