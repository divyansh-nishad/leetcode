public class HIndex {
    public int hIndex(int[] citations) {
        int l = 0;
        int h = 1000;
        int max = 0;
        while (l <= h) {
            int m = (h + l / 2);
            if (helper(citations, m)) {
                max = Math.max(max, m);
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return max;

    }

    public static boolean helper(int arr[], int m) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= m)
                c++;
        }
        if (c >= m)
            return true;
        else
            return false;
    }

}
