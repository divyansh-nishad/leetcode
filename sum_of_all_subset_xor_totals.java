public class sum_of_all_subset_xor_totals {
    public int subsetXORSum(int[] nums) {
        return sumXor(nums, 0, 0);

    }

    private int sumXor(int nums[], int i, int res) {
        if (i >= nums.length)
            return res;

        return sumXor(nums, i + 1, res ^ nums[i]) + sumXor(nums, i + 1, res);
    }

}
