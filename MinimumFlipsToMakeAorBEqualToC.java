public class MinimumFlipsToMakeAorBEqualToC {
    public int minFlips(int a, int b, int c) {
        int ans = 0, ab = a | b, equal = ab ^ c;
        for (int i = 0; i < 31; ++i) {
            int mask = 1 << i;
            if ((equal & mask) > 0)
                ans += (a & mask) == (b & mask) && (c & mask) == 0 ? 2 : 1;
        }
        return ans;
    }

}
