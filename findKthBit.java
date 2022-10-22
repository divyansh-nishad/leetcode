public class findKthBit {
    public char findKthBit(int n, int k) {
        if (n == 1)
            return '0';
        int len = 1 << n;
        if (k < len / 2)
            return findKthBit(n - 1, k);
        if (k == len / 2)
            return '1';
        return findKthBit(n - 1, len - k) == '0' ? '1' : '0';
    }

}
