public class number_of_good_pair {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j])
                        c++;
                }
            }
        }
        c = c / 2;
        return c;
    }

}
