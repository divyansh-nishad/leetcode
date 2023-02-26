public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0)
            return n;
        if (n == 0)
            return m;
        int[][] md = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    md[i][j] = j;
                else if (j == 0)
                    md[i][j] = i;
                else if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    md[i][j] = md[i - 1][j - 1];
                else
                    md[i][j] = 1 + Math.min(md[i - 1][j - 1], Math.min(md[i - 1][j], md[i][j - 1]));
            }
        }
        return md[m][n];
    }

}
