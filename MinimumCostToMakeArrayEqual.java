public class MinimumCostToMakeArrayEqual {
    private long findCost(int[] nums, int[] cost, long x) {
        long res = 0L;
        for (int i = 0; i < nums.length; i++) {
            res += Math.abs(nums[i] - x) * cost[i];
        }
        return res;
    }

    public long minCost(int[] nums, int[] cost) {
        long left = 1L;
        long right = 1000000L;
        for (int num : nums) {
            left = Math.min(num, left);
            right = Math.max(num, right);
        }
        long ans = findCost(nums, cost, 1);
        while (left < right) {
            long mid = (left + right) / 2;
            long y1 = findCost(nums, cost, mid);
            long y2 = findCost(nums, cost, mid + 1);
            ans = Math.min(y1, y2);
            if (y1 < y2) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
