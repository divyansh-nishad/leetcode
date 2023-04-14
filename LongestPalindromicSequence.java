class LongestPalindromicSequence {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        if (len < 2)
            return len;
        int[][] dp = new int[len + 1][len + 1];
        String reverse = new StringBuilder(s).reverse().toString();
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                if (s.charAt(i - 1) == reverse.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[len][len];
    }
}