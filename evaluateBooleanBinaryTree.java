public class evaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        if (root == null)
            return true;
        if (root.val == 0)
            return false;
        else if (root.val == 1)
            return true;
        else {
            if (root.val == 2)
                return evaluateTree(root.left) || evaluateTree(root.right);
            else if (root.val == 3)
                return evaluateTree(root.left) && evaluateTree(root.right);
        }
        return false;
    }

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
}
