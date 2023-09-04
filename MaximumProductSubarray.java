public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;
            if (suff == 0)
                suff = 1;

            pre = pre * nums[i];
            suff = suff * nums[n - i - 1];
            ans = Math.max(Math.max(pre, suff), ans);
        }
        return ans;
    }

}
