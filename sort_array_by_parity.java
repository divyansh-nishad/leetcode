public class sort_array_by_parity {
    public int[] sortArrayByParity(int[] nums) {
        int l = nums.length;
        int arr[] = new int[l];
        int c = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] % 2 == 0)
                arr[c++] = nums[i];
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] % 2 != 0) {
                arr[c++] = nums[i];
            }
        }
        return arr;
    }
}
