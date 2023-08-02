public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        int temp[] = new int[k];
        int count = 0;
        for (int i = n - k; i < n; i++) {
            temp[count++] = nums[i];
        }
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
