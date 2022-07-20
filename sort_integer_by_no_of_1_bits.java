public class sort_integer_by_no_of_1_bits {
    public int[] sortByBits(int[] arr) {
        int n = arr.length, res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countBitOne(arr[i]) * 10001 + arr[i];
        }

        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }

        return res;
    }

    private int countBitOne(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }

}
