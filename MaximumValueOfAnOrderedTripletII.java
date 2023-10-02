public class MaximumValueOfAnOrderedTripletII {
    public long maximumTripletValue(int[] nums) {
        long pre[] = new long[nums.length];
        long suf[] = new long[nums.length];
        long ans = 0;
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = Math.max(pre[i - 1], nums[i]);
        }
        suf[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = Math.max(suf[i + 1], nums[i]);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            // System.out.println(pre[i-1]+" "+suf[i+1]);
            ans = Math.max(ans, (pre[i - 1] - nums[i]) * suf[i + 1]);
        }
        return ans;
    }

}
