import java.util.*;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(ans, list, 0, nums, nums.length);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, int ind, int[] nums, int n) {
        ans.add(new ArrayList<>(list));
        for (int i = ind; i < n; i++) {
            if (i > ind && nums[i] == nums[i - 1])
                continue;
            list.add(nums[i]);
            helper(ans, list, i + 1, nums, n);
            list.remove(list.size() - 1);
        }
    }
}
