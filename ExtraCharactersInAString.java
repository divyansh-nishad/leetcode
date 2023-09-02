public class ExtraCharactersInAString {
    public int minExtraChar(String s, String[] dictionary) {
        int[] dp = new int[51];
        int n = s.length();

        for (int i = n - 1; i >= 0; --i) {
            dp[i] = 1 + dp[i + 1];
            for (String w : dictionary) {
                if (i + w.length() <= n && s.substring(i, i + w.length()).equals(w)) {
                    dp[i] = Math.min(dp[i], dp[i + w.length()]);
                }
            }
        }

        return dp[0];
    }
}
