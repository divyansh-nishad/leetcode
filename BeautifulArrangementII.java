public class BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int i = 1;
        int j = n;
        for (int l = 0; l < n; l++) {
            if (k > 1) {
                if (k % 2 == 0) {
                    arr[l] = j;
                    j--;
                } else {
                    arr[l] = i;
                    i++;
                }
                k--;
            } else {
                arr[l] = i++;
            }
        }
        return arr;
    }

}
