public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null)
            return 0;
        int ans = 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            ans += root.left.val + sumOfLeftLeaves(root.left);
        if (root.left != null && (root.left.left != null || root.left.right != null))
            ans += sumOfLeftLeaves(root.left);
        if (root.right != null)
            ans += sumOfLeftLeaves(root.right);
        return ans;

    }

}
