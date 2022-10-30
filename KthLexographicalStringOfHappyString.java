public class KthLexographicalStringOfHappyString {
    public String getHappyString(int n, int k) {
        k = k - 1;
        int p = 1 << (n - 1);
        char ch = (char) (k / p + 'a');
        if (ch > 'c')
            return "";
        String ans = "" + ch;
        for (int i = 1; i < n; i++) {
            k = k % p;
            p = p >> 1;
            char nch = 'a';
            if (ch == nch)
                nch++;
            if (k >= p)
                nch++;
            if (ch == nch)
                nch++;
            ans = ans + nch;
            ch = nch;
        }
        return ans;
    }
}
