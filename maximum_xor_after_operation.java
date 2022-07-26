public class maximum_xor_after_operation {
    public int maximumXOR(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res |= i;
        }
        return res;
    }

}
