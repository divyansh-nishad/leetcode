public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        int arr[] = new int[n + 1];
        if (n < 2)
            return n;
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = i % 2 == 0 ? arr[i / 2] : arr[i / 2] + arr[i / 2 + 1];
            max = Math.max(max, arr[i]);
        }

        // return max;
    }

}
