public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        boolean[] visited = new boolean[n];
        Arrays.sort(nums);
        helper(ans, list, visited, n, nums);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, boolean[] visited, int n, int[] nums) {
        if (list.size() == n) {
            ans.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = 0; i < n; i++) {
                if (i > 0 && nums[i - 1] == nums[i] && !visited[i - 1])
                    continue;
                if (!visited[i]) {
                    visited[i] = true;
                    list.add(nums[i]);
                    helper(ans, list, visited, n, nums);
                    list.remove(list.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}