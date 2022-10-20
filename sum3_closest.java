import java.util.*;

public class sum3_closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int x = i + 1;
            int y = nums.length - 1;
            while (x < y) {
                int sum = nums[i] + nums[x] + nums[y];
                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = (target - sum);
                if (sum < target)
                    x++;
                else
                    y--;
            }
        }
        return target - diff;
    }

}
