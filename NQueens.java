public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> ans = new ArrayList<>();
        helper(ans, 0, board, n);
        return ans;
    }

    private void helper(List<List<String>> ans, int row, char[][] board, int n) {
        if (row == n) {
            ans.add(new ArrayList<>(construct(board)));
            return;
        } else {
            for (int j = 0; j < n; j++) {
                if (isSafe(board, row, j, n)) {
                    board[row][j] = 'Q';
                    helper(ans, row + 1, board, n);
                    board[row][j] = '.';
                }
            }
        }
    }

    private boolean isSafe(char[][] board, int i, int j, int n) {
        int r = i, c = j;
        while (r >= 0)
            if (board[r--][c] == 'Q')
                return false;
        r = i;
        while (r >= 0 && c >= 0)
            if (board[r--][c--] == 'Q')
                return false;
        r = i;
        c = j;
        while (r >= 0 && c < n)
            if (board[r--][c++] == 'Q')
                return false;
        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

}
