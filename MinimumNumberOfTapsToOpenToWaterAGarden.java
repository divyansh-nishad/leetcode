import java.util.Arrays;

public class MinimumNumberOfTapsToOpenToWaterAGarden {
    public int minTaps(int n, int[] ranges) {
        n = ranges.length;
        int dp[] = new int[n];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int start = Math.max(i - ranges[i], 0);
            int end = Math.min(i + ranges[i], n - 1);
            for (int j = start; j <= end; j++) {
                dp[j] = Math.min(dp[j], dp[start] + 1);
            }
        }
        return dp[n - 1] == n + 1 ? -1 : dp[n - 1];
    }

}
