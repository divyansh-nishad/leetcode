public class ProfitableSchemes {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int mod = (int) 1e9 + 7;
        int[][] memo = new int[n + 1][minProfit + 1];
        memo[0][0] = 1;
        for (int k = 1; k <= group.length; k++) {
            int g = group[k - 1], p = profit[k - 1];
            for (int i = n; g <= i; i--) {
                for (int j = minProfit; 0 <= j; j--) {
                    memo[i][j] = (memo[i][j] + memo[i - g][Math.max(0, j - p)]) % mod;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = (ans + memo[i][minProfit]) % mod;
        }
        return ans;
    }

}
