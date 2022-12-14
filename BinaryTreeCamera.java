public class BinaryTreeCamera {
    int res = 0;

    public int minCameraCover(TreeNode root) {
        if (helper(root) == 0)
            return res + 1;
        else
            return res;
    }

    private int helper(TreeNode root) {
        if (root == null)
            return 2;
        int left = helper(root.left);
        int right = helper(root.right);
        if (left == 0 || right == 0) {
            res++;
            return 1;
        }
        if (left == 1 || right == 1)
            return 2;
        return 0;
    }

}
