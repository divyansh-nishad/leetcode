public class KnightProbabilityInVhessboard {
    int[][] direction = new int[][] { { 2, 1 }, { -2, 1 }, { 2, -1 }, { -2, -1 }, { 1, 2 }, { 1, -2 }, { -1, 2 },
            { -1, -2 } };

    public double knightProbability(int N, int K, int r, int c) {
        double[][] prevWays = new double[N][N];
        prevWays[r][c] = 1;
        double res = 0;
        for (int k = 1; k <= K; ++k) {
            double[][] ways = new double[N][N];
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    for (int[] dir : direction) {
                        int oldR = i - dir[0];
                        int oldC = j - dir[1];
                        if (oldR >= 0 && oldC >= 0 && oldR < N && oldC < N) {
                            ways[i][j] += (prevWays[oldR][oldC] / 8.0);
                        }
                    }
                }
            }
            prevWays = ways;
        }
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                res += prevWays[i][j];
            }
        }
        return res;
    }

}
