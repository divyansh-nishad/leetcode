public class hamming_distance {
    public int hammingDistance(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if (((x & (1 << i)) ^ (y & (1 << i))) != 0)
                cnt++;
        }
        return cnt;
    }

}
