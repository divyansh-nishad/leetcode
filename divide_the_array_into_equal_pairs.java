import java.util.*;

public class divide_the_array_into_equal_pairs {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int cnt = mp.containsKey(nums[i]) ? mp.get(nums[i]) : 0;
            mp.put(nums[i], cnt + 1);
        }
        int res = 0;
        for (int i : mp.values())
            res += i / 2;
        return res == (n / 2);
    }

}
