public class missing_number {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++)
            res = res ^ nums[i];
        for (int i = 0; i < nums.length + 1; i++)
            res = res ^ i;
        return res;
    }

}
