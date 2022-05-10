public class shuffle_the_array {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int c = 0;
        for (int i = 0; i < 2 * n; i = i + 2) {
            arr[i] = nums[c++];
        }
        c = n;
        for (int i = 1; i < 2 * n; i = i + 2) {
            arr[i] = nums[c++];
        }
        return arr;
    }

}
