public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), nums);
        return list;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i]))
                    continue;
                list.add(nums[i]);
                helper(result, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }

}
