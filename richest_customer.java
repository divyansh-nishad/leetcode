public class richest_customer {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < n; i++)
            max = max + accounts[0][i];
        for (int i = 1; i < m; i++) {
            int newmax = 0;
            for (int j = 0; j < n; j++) {
                newmax += accounts[i][j];
            }
            if (newmax > max)
                max = newmax;
        }
        return max;

    }
}
