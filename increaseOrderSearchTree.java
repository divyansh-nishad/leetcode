public class increaseOrderSearchTree {
    TreeNode prev = null, head = null;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return null;
        increasingBST(root.left);
        if (prev != null) {
            root.left = null;
            prev.right = root;
        }
        if (head == null)
            head = root;
        prev = root;
        increasingBST(root.right);
        return head;

    }

    // **************************************
    // for TreeNode
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
