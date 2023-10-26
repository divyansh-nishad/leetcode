public class PartitionEqualSubSetSum {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totSum = 0;
        for (int num : nums)
            totSum += num;
        if (totSum % 2 == 1)
            return false;

        int target = totSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = target; j >= nums[i - 1]; j--) {
                dp[j] = dp[j] || dp[j - nums[i - 1]];
            }
        }

        return dp[target];
    }

}
