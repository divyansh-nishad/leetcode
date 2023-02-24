public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0)
            return 0;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        return ans + duration;
    }   
}
