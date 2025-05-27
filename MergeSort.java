class Solution {
    public int[] sortArray(int[] arr) {
        mergesort(arr, 0, arr.length-1);
        return arr;
    }
    private void mergesort(int[] arr, int lo, int hi)
    {
        if (lo>=hi)
            return;
        int mid = (lo+(hi-lo)/2);
        mergesort(arr,lo, mid);
        mergesort(arr, mid+1, hi);
        merge(arr, lo, mid, hi);
    }
    private void merge(int[] arr, int lo, int mid, int hi)
    {
        int l1 = mid-lo+1;
        int l2 = hi-mid;
        int[] left = new int[l1];
        int[] right = new int[l2];
        for(int i=0;i<l1;i++)
            left[i] = arr[lo+i];
        for(int i=0;i<l2;i++)
            right[i] = arr[mid+i+1];

        int i=0, j= 0, k= lo;

        while(i<l1 || j< l2)
        {
            if (j == l2 || i < l1 && left[i] < right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
            }
        }

    }
}
