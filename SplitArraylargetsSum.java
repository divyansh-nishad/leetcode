public class SplitArraylargetsSum {
    public int splitArray(int[] nums, int k) {
        if (k > nums.length)
            return -1;
        int lo = 0;
        int hi = 0;
        for (int num : nums) {
            lo = Math.max(lo, num);
            hi += num;
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int avail = canWeSplit(nums, mid);
            if (avail > k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    private int canWeSplit(int[] nums, int sum) {
        int sub = 1;
        int sumArr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sumArr + nums[i] <= sum) {
                sumArr += nums[i];
            } else {
                sub++;
                sumArr = nums[i];
            }
        }
        return sub;
    }

}
