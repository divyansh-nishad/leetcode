import java.util.Arrays;

public class CountVowelsPermutations {
    public int countVowelPermutation(int n) {
        long MOD = (long) (1e9 + 7);
        long[] dpLast = new long[6];
        Arrays.fill(dpLast, 1);
        for (int len = 1; len <= n; len++) {
            long[] dpCurr = new long[6];
            for (int last = 0; last <= 5; last++) {
                long count = 0;
                if (last == 2)
                    count = (count + dpLast[1]) % MOD;
                if (last == 1 || last == 3)
                    count = (count + dpLast[2]) % MOD;
                if (last == 1 || last == 2 || last == 4 || last == 5)
                    count = (count + dpLast[3]) % MOD;
                if (last == 3 || last == 5)
                    count = (count + dpLast[4]) % MOD;
                if (last == 1)
                    count = (count + dpLast[5]) % MOD;
                if (last == 0)
                    for (int i = 1; i <= 5; i++)
                        count = (count + dpLast[i]) % MOD;

                dpCurr[last] = count;
            }
            dpLast = dpCurr;
        }
        return (int) dpLast[0];
    }
}
