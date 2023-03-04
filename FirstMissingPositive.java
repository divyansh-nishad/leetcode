public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int idx = 0;
        while (idx < nums.length) {
            int correct = nums[idx] - 1;
            if (nums[idx] > 0 && nums[idx] <= nums.length && nums[idx] != nums[correct]) {
                swap(nums, idx, correct);
            } else
                idx++;
        }

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] != x + 1) {
                return x + 1;
            }
        }
        return nums.length + 1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
