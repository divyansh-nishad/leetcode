public class SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        int arr[] = { 0 };
        sum(root, 0, arr);
        return arr[0];
    }

    private void sum(TreeNode root, int s, int[] arr) {
        s = (s << 1) + root.val;
        if (root.left == null && root.right == null) {
            arr[0] += s;
            return;
        } else {
            if (root.left != null)
                sum(root.left, s, arr);
            if (root.right != null)
                sum(root.right, s, arr);
        }
    }

}
