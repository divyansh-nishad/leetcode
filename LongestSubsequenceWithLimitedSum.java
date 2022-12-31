import java.util.*;
public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length, m = queries.length, res[] = new int[m];
        for (int i = 1; i < n; ++i)
            nums[i] += nums[i - 1];
        for (int i = 0; i < m; ++i) {
            int j = Arrays.binarySearch(nums, queries[i]);
            res[i] = Math.abs(j + 1);
        }
        return res;
    }

}
