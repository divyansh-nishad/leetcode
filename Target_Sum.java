public class Target_Sum {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0, 0, nums, target);

    }

    private int helper(int res, int ind, int[] nums, int sum) {
        if (ind == nums.length) {
            if (res == sum)
                return 1;
            return 0;
        } else {
            int count = 0;
            count += helper(res + nums[ind], ind + 1, nums, sum);
            count += helper(res - nums[ind], ind + 1, nums, sum);
            return count;
        }
    }
}
