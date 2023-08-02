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
class Solution {
    //most optimal solution
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is larger than the length of the array, take the modulo.

        // Reverse the first n-k elements.
        reverseArray(nums, 0, n - k - 1);

        // Reverse the rest elements.
        reverseArray(nums, n - k, n - 1);

        // Reverse the entire array.
        reverseArray(nums, 0, n - 1);
    }
    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}