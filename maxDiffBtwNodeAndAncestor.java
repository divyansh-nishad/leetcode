public class maxDiffBtwNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }
    private int helper(TreeNode root, int min, int max)
    {
        if(root==null)
            return max-min;
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        return Math.max(helper(root.left, min, max), helper(root.right, min, max));

        
    }
    
}
