import java.util.*;

public class twoSumIV_input_is_a_bst {
    private boolean helper(TreeNode root, HashSet<Integer> hs, int k) {
        if (root == null)
            return false;
        if (hs.contains(k - root.val))
            return true;
        hs.add(root.val);
        return helper(root.left, hs, k) || helper(root.right, hs, k);

    }

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs = new HashSet<>();
        return helper(root, hs, k);

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
