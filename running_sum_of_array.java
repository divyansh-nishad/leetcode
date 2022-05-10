public class running_sum_of_array {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        int rsum[] = new int[l];
        int sum = 0;
        for (int i = 0; i < l; i++) {
            rsum[i] = sum + nums[i];
            sum += nums[i];
        }
        return rsum;
    }
}
