import java.util.Arrays;

public class CountAllPossibleRoutes {
    int[][] dp;
    int n;
    int finish;

    public int solve(int[] locations, int currCity, int remainingFuel) {
        if (remainingFuel < 0) {
            return 0;
        }
        if (dp[currCity][remainingFuel] != -1) {
            return dp[currCity][remainingFuel];
        }

        int ans = currCity == finish ? 1 : 0;
        for (int nextCity = 0; nextCity < n; nextCity++) {
            if (nextCity != currCity) {
                ans = (ans + solve(locations, nextCity,
                        remainingFuel - Math.abs(locations[currCity] - locations[nextCity]))) % 1000000007;
            }
        }

        return dp[currCity][remainingFuel] = ans;
    }

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        n = locations.length;
        dp = new int[n][fuel + 1];
        this.finish = finish;
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dp[i], -1);
        }

        return solve(locations, start, fuel);
    }   

}
