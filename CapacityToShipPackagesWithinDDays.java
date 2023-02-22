public class CapacityToShipPackagesWithinDDays {
    private boolean check(int[] weights, int days, int n, int mx) {
        int st = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += weights[i];
            if (sum > mx) {
                st++;
                sum = weights[i];
            }
            if (st > days)
                return false;
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += weights[i];
        }
        int s = weights[0];
        for (int i = 1; i < n; i++) {
            s = Math.max(s, weights[i]);
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (check(weights, days, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else
                s = mid + 1;
        }
        return ans;
    }

}
