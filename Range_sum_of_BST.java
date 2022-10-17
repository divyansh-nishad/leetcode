public class Range_sum_of_BST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        else {
            if (root.val <= high && root.val >= low)
                return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
            else
                return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }

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
