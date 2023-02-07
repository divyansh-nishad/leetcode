public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        long lo = 1;
        long hi = (long) 1e9;
        long min = Long.MIN_VALUE;
        while (lo <= hi) {
            long m = (lo + hi) / 2;
            if (helper(piles, h, m)) {
                min = m;
                hi = m - 1;
            } else {
                lo = m + 1;
            }
        }
        return (int) min;
    }

    static boolean helper(int arr[], int h, long m) {
        long c = 0;
        for (int i = -0; i < arr.length; i++) {
            c += (1l * arr[i] + m - 1) / m;
        }
        return c <= h;
    }

}
