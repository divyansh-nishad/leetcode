public class CountSubaaraysWithFixedBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        long lastOut = -1, lastMin = -1, lastMax = -1, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                lastOut = i;
            if (nums[i] == minK)
                lastMin = i;
            if (nums[i] == maxK)
                lastMax = i;
            ans += Math.max(0L, Math.min(lastMin, lastMax) - lastOut);
        }
        return ans;
    }

}
