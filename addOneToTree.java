public class addOneToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newroot = new TreeNode(val);
            newroot.left = root;
            root = newroot;
        } else if (depth == 2 && root != null) {
            if (root.left != null) {
                TreeNode lefty = new TreeNode(val);
                lefty.left = root.left;
                root.left = lefty;
            } else {
                root.left = new TreeNode(val);
            }
            if (root.right != null) {
                TreeNode righty = new TreeNode(val);
                righty.right = root.right;
                root.right = righty;
            } else {
                root.right = new TreeNode(val);
            }
        } else {
            if (root.left != null)
                addOneRow(root.left, val, depth - 1);
            if (root.right != null)
                addOneRow(root.right, val, depth - 1);
        }
        return root;
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
