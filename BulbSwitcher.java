public class BulbSwitcher {
    public int bulbSwitch(int n) {
        return helper(n);
    }

    private int helper(int num) {
        if (num == 1) {
            return 1;
        }
        int low = 1, high = num / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int temp = num / mid;
            if (mid == temp) {
                return (mid);
            } else if (mid < temp) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (low - 1);
    }

}
