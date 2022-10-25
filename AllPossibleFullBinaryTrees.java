import java.util.*;

public class AllPossibleFullBinaryTrees {
    public List<TreeNode> allPossibleFBT(int n) {
        if ((n <= 0) || n % 2 == 0)
            return new ArrayList<TreeNode>();
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if (n == 1) {
            ans.add(new TreeNode(0));
            return ans;
        }
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> l = allPossibleFBT(i);
            List<TreeNode> r = allPossibleFBT(n - i - 1);
            for (TreeNode lf : l) {
                for (TreeNode rr : r) {
                    TreeNode root = new TreeNode(0);
                    root.left = lf;
                    root.right = rr;
                    ans.add(root);
                }
            }
        }
        return ans;

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
