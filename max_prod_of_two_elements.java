import java.util.*;

public class max_prod_of_two_elements {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        return ((nums[l - 1] - 1) * (nums[l - 2] - 1));
    }

}
