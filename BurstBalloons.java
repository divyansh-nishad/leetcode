import java.util.*;

public class BurstBalloons {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 2];
        arr[0] = 1;
        arr[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }

        int dp[][] = new int[n + 1][n + 1];
        for (int[] a : dp)
            Arrays.fill(a, -1);
        return rec(arr, 1, n, dp);
    }

    public int rec(int[] arr, int left, int right, int[][] dp) {
        if (left > right)
            return 0;
        if (dp[left][right] != -1)
            return dp[left][right];
        int max = 0;
        for (int i = left; i <= right; i++) {
            int l = rec(arr, left, i - 1, dp);
            int last = arr[left - 1] * arr[i] * arr[right + 1];
            int r = rec(arr, i + 1, right, dp);
            max = Math.max(max, l + last + r);
        }
        return dp[left][right] = max;
    }

}
