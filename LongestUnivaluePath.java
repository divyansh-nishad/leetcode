public class LongestUnivaluePath {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null)
            return 0;
        helper(root, root.val);
        return max;

    }

    private int helper(TreeNode root, int val) {
        if (root == null)
            return 0;
        int left = helper(root.left, root.val);
        int right = helper(root.right, root.val);

        max = Math.max(max, left + right);
        if (val == root.val)
            return Math.max(left, right) + 1;
        return 0;
    }

}
