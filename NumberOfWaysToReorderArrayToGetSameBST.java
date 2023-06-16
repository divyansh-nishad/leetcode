import java.util.ArrayList;
import java.util.List;

public class NumberOfWaysToReorderArrayToGetSameBST {
    private static long mod = 1000000007;
    private long[] inverse = new long[10001];

    public int numOfWays(int[] nums) {
        inverseFunc();

        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return (int) ((num(list) - 1) % mod);
    }

    public long num(List<Integer> nums) {

        if (nums == null || nums.size() <= 2)
            return 1;

        int root = nums.get(0);
        List<Integer> lessThan = new ArrayList<>();
        List<Integer> greaterThan = new ArrayList<>();

        for (int val : nums) {
            if (val > root) {
                greaterThan.add(val);
            } else if (val < root) {
                lessThan.add(val);
            }
        }

        return ((((comb(lessThan.size() + greaterThan.size(), greaterThan.size())) % mod) * num(lessThan)) % mod
                * num(greaterThan)) % mod;
    }

    public long comb(int a, int b) {
        if (a <= 0 || b <= 0)
            return 1;

        long ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = (ans * a) % mod;
            a--;
        }

        while (b >= 1) {
            ans = (ans * inverse[b--]) % mod;
        }
        return ans;
    }

    void inverseFunc() {
        for (int i = 1; i <= 1000; i++) {
            inverse[i] = power(i, mod - 2, mod) % mod;
        }
    }

    long power(long x, long y, long p) {
        long res = 1;

        x = x % p;

        if (x == 0)
            return 0;

        while (y > 0) {

            if ((y & 1) != 0)
                res = (res * x) % p;

            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

}
