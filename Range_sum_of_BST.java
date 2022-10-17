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
}
