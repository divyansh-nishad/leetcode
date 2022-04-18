public class BSTtoGT {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null)
            return null;
        convertBST(root.right);
        int tmp = root.val;
        root.val += sum;
        sum += tmp;
        convertBST(root.left);
        return root;

    }

    // ***************************
    // Only for treenode
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
    // ***************************

}
