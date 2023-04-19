public class LongestZigZagPathInBinaryTree {
    public int longestZigZag(TreeNode root) {
        int[] max = { 0 };
        longestZigZag(root, 1, 0, max);
        longestZigZag(root, 0, 0, max);
        return max[0];
    }

    private void longestZigZag(TreeNode root, int dir, int cur, int[] max) {
        if (root == null)
            return;
        max[0] = Math.max(max[0], cur);
        if (dir == 1) {
            longestZigZag(root.left, 0, cur + 1, max);
            longestZigZag(root.right, 1, 1, max);
        } else {
            longestZigZag(root.right, 1, cur + 1, max);
            longestZigZag(root.left, 0, 1, max);
        }
    }

}
