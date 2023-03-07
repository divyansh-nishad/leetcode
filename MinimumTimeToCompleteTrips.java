public class MinimumTimeToCompleteTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = 0;
        long hi = 100_000_000_000_000L;
        long min = Long.MAX_VALUE;
        ;
        while (lo <= hi) {
            long m = lo + (hi - lo) / 2;
            if (check(time, totalTrips, m)) {
                min = Math.min(min, m);
                hi = m - 1;
                // System.out.println(m);
            } else
                lo = m + 1;
        }
        return min;
    }

    private boolean check(int[] arr, int k, long time) {
        long c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += (time / arr[i]);
        }
        // System.out.println(c);
        if (c >= k)
            return true;
        return false;
    }

}
