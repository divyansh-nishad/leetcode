public class ChampagneTower {
    public double champagneTower(int k, int r, int c) {
        // If no champagne is poured, the glass is empty.
        if (k == 0)
            return 0.0;

        // Create a 2D array to represent the glasses pyramid.
        double[][] dp = new double[r + 1][c + 2];
        dp[0][0] = k; // Put all the poured champagne in the top glass.

        // Iterate through each row.
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= c; j++) {
                if (dp[i][j] > 1.0) {
                    // Calculate excess champagne and distribute it equally to the glasses below.
                    double spare = dp[i][j] - 1;
                    spare /= 2;
                    dp[i][j] = 1; // Set the current glass to hold exactly one cup.
                    dp[i + 1][j] += spare; // Distribute excess to the left glass below.
                    dp[i + 1][j + 1] += spare; // Distribute excess to the right glass below.
                }
            }
        }

        // Check the value in the desired glass (r, c).
        double result = dp[r][c];

        // Ensure that the value doesn't exceed 1, as each glass can hold a maximum of
        // one cup.
        return Math.min(result, 1.0);
    }

}
