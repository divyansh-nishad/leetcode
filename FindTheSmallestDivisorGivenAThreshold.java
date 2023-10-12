public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo = 1;
        int hi = (int) 1e6;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (helper(nums, threshold, mid) <= threshold) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private int helper(int[] arr, int x, int mid) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += (int) (Math.ceil(arr[i] / (1.0 * mid)));
        }
        return cnt;
    }

}
