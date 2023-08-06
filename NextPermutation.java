public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            int i = 0;
            int j = n - 1;
            while (i < j) {
                swap(nums, i, j);
                i++;
                j--;
            }
            return;
        }
        for (int i = n - 1; i >= ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }
        int i = ind + 1;
        int j = n - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }

    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
