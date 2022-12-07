public class CountNodeEqualToAverageOfSubtree {
    private int count = 0;

    public int averageOfSubtree(TreeNode root) {
        if (root == null)
            return count;
        helper(root);
        return count;
    }

    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[] { 0, 0 };
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int totalSum = left[0] + right[0] + root.val;
        int totalNode = left[1] + right[1] + 1;
        if (totalSum / totalNode == root.val)
            count++;
        return new int[] { totalSum, totalNode };
    }

}
