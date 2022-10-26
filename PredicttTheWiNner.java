public class PredicttTheWiNner {
    public boolean PredictTheWinner(int[] nums) {
        return helper(0, nums.length - 1, 0, nums, true) >= 0;
    }

    private int helper(int s, int e, int p, int[] nums, boolean turn1) {
        if (s == e) {
            if (turn1)
                return p + nums[s];
            return p - nums[s];
        }
        if (turn1) {
            int top = helper(s, e - 1, p + nums[e], nums, false);
            int bot = helper(s + 1, e, p + nums[s], nums, false);
            return Math.max(top, bot);
        } else {
            int top = helper(s, e - 1, p - nums[e], nums, true);
            int bot = helper(s + 1, e, p - nums[s], nums, true);
            return Math.min(top, bot);
        }
    }
}
