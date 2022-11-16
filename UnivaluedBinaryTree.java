public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return true;
        else
        {
            if(root.left!=null && root.val!=root.left.val)
                return false;
            if(root.right!=null && root.val!=root.right.val)
                return false;
            else
            {
                return (isUnivalTree(root.left) && isUnivalTree(root.right));
            }
        }
    }
    
}
