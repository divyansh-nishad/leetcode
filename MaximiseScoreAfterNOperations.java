public class MaximiseScoreAfterNOperations {
    public int maxScore(int[] nums) {
        Map<Integer, Integer> maskToGcd = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maskToGcd.put((1 << i) | (1 << j), gcd(nums[i], nums[j]));
            }
        }

        int[] dp = new int[1 << n];
        for (int i = 0; i < (1 << n); i++) {
            int bitCount = Integer.bitCount(i);
            if (bitCount % 2 != 0)
                continue;

            for (int pair : maskToGcd.keySet()) {
                if ((i & pair) == pair) { // pair is included in the current bit mask
                    int prev = i ^ pair;
                    dp[i] = Math.max(dp[i], dp[prev] + maskToGcd.get(pair) * (bitCount / 2));
                }
            }
        }

        return dp[(1 << n) - 1];
    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

}
