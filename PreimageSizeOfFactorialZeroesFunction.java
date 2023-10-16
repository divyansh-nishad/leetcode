public class PreimageSizeOfFactorialZeroesFunction {
    public int preimageSizeFZF(int k) {
        long lo = 0;
        long hi = (long) 1e10;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long val = mid;
            long ans = 0;
            while (val != 0) {
                val /= 5;
                ans += val;
            }
            if (ans == k) {
                return 5;
            } else if (ans > k) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }

        }
        return 0;
    }
}
