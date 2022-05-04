import java.util.*;

public class max_no_ksum_pairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0, i = 0, j = nums.length - 1;
        while (i < j)
            if (nums[i] + nums[j] > k)
                j--;
            else if (nums[i] + nums[j] < k)
                i++;
            else {
                i++;
                j--;
                result++;
            }
        return result;

    }
}
