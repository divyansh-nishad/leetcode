public class find_corresponding_node_of_binary_tree_in_clone {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target)
            return cloned;
        TreeNode res = getTargetCopy(original.left, cloned.left, target);
        if (res != null)
            return res;
        return getTargetCopy(original.right, cloned.right, target);
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
