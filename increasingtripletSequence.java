public class increasingtripletSequence {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= min)
                min = nums[i];
            else if (nums[i] < min2)
                min2 = nums[i];
            else if (nums[i] > min2)
                return true;
        }
        return false;
    }

}
