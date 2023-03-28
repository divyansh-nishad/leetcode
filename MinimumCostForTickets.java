public class MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + costs[0]; 
            int j = i - 1;
            while (j >= 0 && days[i - 1] - days[j] < 7)
                j--;
            dp[i] = Math.min(dp[i], dp[j + 1] + costs[1]); 
            j = i - 1;
            while (j >= 0 && days[i - 1] - days[j] < 30)
                j--;
            dp[i] = Math.min(dp[i], dp[j + 1] + costs[2]); 
        }

        return dp[n];
    }

}
