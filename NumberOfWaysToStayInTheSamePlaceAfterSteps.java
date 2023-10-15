import java.util.Arrays;

public class NumberOfWaysToStayInTheSamePlaceAfterSteps {
    static final int MOD = 1_000_000_007;

    public int numWays(int steps, int arrLen) {
        arrLen = Math.min(steps / 2 + 1, arrLen);
        int[][] dp = new int[arrLen][steps + 1];
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        return calculateWays(steps, 0, dp);
    }

    private static int calculateWays(int steps, int pos, int[][] dp) {
        if (steps < pos)
            return 0;
        if (steps == 0)
            return 1;
        if (dp[pos][steps] != -1)
            return dp[pos][steps];
        int ways = 0;
        if (pos < dp.length - 1)
            ways = (ways + calculateWays(steps - 1, pos + 1, dp)) % MOD;
        if (pos > 0)
            ways = (ways + calculateWays(steps - 1, pos - 1, dp)) % MOD;
        ways = (ways + calculateWays(steps - 1, pos, dp)) % MOD;
        dp[pos][steps] = ways;
        return ways;
    }
}
