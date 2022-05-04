public class build_array_from_permutation {
    public int[] buildArray(int[] nums) {
        int l = nums.length;
        int arr[] = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
