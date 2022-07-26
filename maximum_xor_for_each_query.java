public class maximum_xor_for_each_query {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int res[] = new int[nums.length];
        int xor = 0;
        int maxBit = (1 << maximumBit) - 1;
        for (int i : nums)
            xor ^= i;
        for (int i = 0; i < nums.length; i++) {
            res[i] = xor ^ maxBit;
            xor = xor ^ nums[nums.length - i - 1];
        }
        return res;
    }

}
