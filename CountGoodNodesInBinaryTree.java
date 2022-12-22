public class CountGoodNodesInBinaryTree {
    int count = 0;

    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return count;
    }

    private void helper(TreeNode root, int max) {
        if (root == null)
            return;
        if (root.val >= max) {
            count++;
        }
        max = Math.max(max, root.val);
        helper(root.left, max);
        helper(root.right, max);

    }

}
