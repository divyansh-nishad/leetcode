public class HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return nums[0];
        return Math.max(helper(nums, 0, n - 2), helper(nums, 1, n - 1));
    }

    private int helper(int nums[], int start, int end) {
        int n = end - start + 1;
        if (n < 2)
            return nums[start];
        int prev = nums[start];
        int cur = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int val = Math.max(prev + nums[i], cur);
            prev = cur;
            cur = val;
        }
        return cur;
    }

}
