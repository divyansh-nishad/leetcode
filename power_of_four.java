public class power_of_four {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n <= 0)
            return false;
        if ((lsb(n) % 2 == 0) && ((n & (n - 1)) == 0))
            return true;
        else
            return false;

    }

    private int lsb(int n) {
        int p = 1;

        while (n > 0) {
            if ((n & 1) > 0) {
                return p - 1;
            }
            p++;
            n = n >> 1;
        }
        return -1;
    }

}
