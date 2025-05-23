public class construct_string_from_binary_tree {
    public String tree2str(TreeNode root) {
        if (root == null)
            return "";
        String str = "" + root.val;
        if (root.left == null && root.right == null)
            return str;
        if (root.left == null)
            return str + "()" + "(" + (tree2str(root.right)) + ")";
        if (root.right == null)
            return str + "(" + (tree2str(root.left)) + ")";
        return str + "(" + (tree2str(root.left)) + ")" + "(" + (tree2str(root.right)) + ")";

    }

}

// ****************************************************************
// For treeNode
class TreeNode {
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
