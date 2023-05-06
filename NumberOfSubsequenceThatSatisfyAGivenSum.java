public class NumberOfSubsequenceThatSatisfyAGivenSum {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1000000007;
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                ans = (ans + pow2[r - l]) % MOD;
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

}
