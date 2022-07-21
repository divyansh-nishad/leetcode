import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prime_Number_of_Set_Bits_in_Binary_Representation {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        Set<Integer> primes = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        for (int i = left; i <= right; i++) {
            if (primes.contains(cbits(i)))
                cnt++;
        }
        return cnt;
    }

    private int cbits(int n) {
        int c = 0;
        while (n != 0) {
            n = (n & (n - 1));
            c++;
        }
        return c;
    }

}
