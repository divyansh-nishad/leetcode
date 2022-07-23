public class binary_number_with_alternating_bits {
    public boolean hasAlternatingBits(int n) {
        int num = n;
        int c = 0;
        while (num > 0) {
            num = num >> 1;
            c++;
        }
        // System.out.println(c);
        int prev = (n & 1);
        for (int i = 1; i < c; i++) {
            int next = (n & (1 << (i)));
            // System.out.println("Prev="+prev+" Next="+next);
            if ((next != 0 && prev != 0) || (next == 0 && prev == 0))
                return false;
            prev = (n & (1 << i));
        }
        return true;
    }

}
