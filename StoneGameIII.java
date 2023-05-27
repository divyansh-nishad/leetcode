public class StoneGameIII {
    public String stoneGameIII(int[] A) {
        int n = A.length, dp[] = new int[n + 1];
        for (int i = n - 1; i >= 0; --i) {
            dp[i] = Integer.MIN_VALUE;
            for (int k = 0, take = 0; k < 3 && i + k < n; ++k) {
                take += A[i + k];
                dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
            }
        }
        if (dp[0] > 0)
            return "Alice";
        if (dp[0] < 0)
            return "Bob";
        return "Tie";
    }

}
