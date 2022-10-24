public class ConvertSortedArrayIntoBinarySearchTree {
    private TreeNode create(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else {
            int mid = (start + end) / 2;
            TreeNode temp = new TreeNode(nums[mid]);
            temp.left = create(nums, start, mid - 1);
            temp.right = create(nums, mid + 1, end);
            return temp;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
    }
}
