public class set_mismatch {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        int count[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[1] ^= (i + 1) ^ nums[i];
            count[nums[i] - 1]++;
            if (count[nums[i] - 1] == 2)
                arr[0] = nums[i];
        }
        arr[1] ^= arr[0];
        return arr;
    }

}
