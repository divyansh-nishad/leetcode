public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int j = 0, i = 0, ans = 0;
        int zeroCount = 0;
        while (j < n) {
            if (nums[j] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[i] == 0)
                    zeroCount--;
                i++;
            }
            j++;
            ans = Math.max(ans, j - i);
        }
        return ans;
    }

}
