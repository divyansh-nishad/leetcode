public class MinimumNumberOfDaysToMakemBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        if (((long) m) * k > bloomDay.length)
            return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int ans = max;
        int lo = min;
        int hi = max;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (helper(bloomDay, m, k, mid)) {
                ans = Math.min(ans, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private boolean helper(int[] arr, int m, int k, int days) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                cnt++;
                if (cnt == k) {
                    cnt = 0;
                    m--;
                }
            } else {
                cnt = 0;
            }
        }
        if (m <= 0)
            return true;
        else
            return false;
    }

}
