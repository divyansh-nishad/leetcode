public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        int[] total = {0};
        helper(root, 0, total);
        return total[0];
    }
    
    void helper(TreeNode root, int sum, int[] total) {
        if (root == null) return;
        
        sum = sum * 10 + root.val;
        
        if (root.left == null && root.right == null) {
            total[0] += sum;
            return;
        }
        
        helper(root.left, sum, total);
        helper(root.right, sum, total);
    }
    
}
