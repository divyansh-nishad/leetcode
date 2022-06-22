public class kth_largest_element_in_a_array {
    public int findKthLargest(int[] nums, int k) {
        int l = nums.length;
        Arrays.sort(nums);
        return nums[l - k];

    }

}
