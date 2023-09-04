public class ReversePairs {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    int mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return 0;
        int count = 0;
        int mid = lo + (hi - lo) / 2;
        count += mergeSort(arr, lo, mid);
        count += mergeSort(arr, mid + 1, hi);
        count += countPairs(arr, lo, mid, hi);
        merge(arr, lo, mid, hi);
        return count;
    }

    int countPairs(int arr[], int lo, int mid, int hi) {
        int count = 0;
        int right = mid + 1;
        for (int i = lo; i <= mid; i++) {
            while (right <= hi && (arr[i]) > (arr[right] * 2.0))
                right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    void merge(int[] arr, int lo, int mid, int hi) {
        int n1 = mid - lo + 1;
        int n2 = hi - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[lo + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = lo;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

}
