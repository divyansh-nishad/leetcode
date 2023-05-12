public class SolvingQuestionsWithBrainPower {
    public long mostPoints(int[][] questions) {
        int len = questions.length;
        long dp[] = new long[len];
        dp[len - 1] = questions[len - 1][0];

        for (int i = len - 2; i >= 0; i--) {
            int nextQuestion = i + questions[i][1] + 1;
            long includePoints = questions[i][0] + (nextQuestion < len ? dp[nextQuestion] : 0);
            dp[i] = Math.max(dp[i + 1], includePoints);
        }

        return dp[0];
    }

}
