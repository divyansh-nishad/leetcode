public class binary_gap {
    public int binaryGap(int n) {
        int max = 0;
        int curr = -1;
        while ((n & 1) == 0)
            n = n >> 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                curr++;
                max = Math.max(curr, max);
                curr = 0;
            } else
                curr++;
            n = n >> 1;
        }
        return max;
    }

}
