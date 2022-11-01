public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans, list, 1, k, n, n);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, int start, int k, int n, int rem) {
        if (rem < 0)
            return;
        else if (rem == 0 && list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = start; i <= 9; i++) {
                list.add(i);
                helper(ans, list, i + 1, k, n, rem - i);
                list.remove(list.size() - 1);
            }
        }
    }

}
