public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        swapper(root);
        return root;
    }

    private void swapper(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            return;
        } else {
            TreeNode temp = new TreeNode();
            temp = root.right;
            root.right = root.left;
            root.left = temp;
            if (root.left != null)
                swapper(root.left);
            if (root.right != null)
                swapper(root.right);

        }
    }

}
