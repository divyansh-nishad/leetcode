public class BinaryTreeTilt {
    private int ans = 0;

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = helper(root.left);
        int r = helper(root.right);

        ans += Math.abs(l - r);

        return l + r + root.val;

    }

    public int findTilt(TreeNode root) {

        helper(root);

        return ans;

    }

    // ****************************************************************
    // For treeNode
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    // ****************************************************************

}
