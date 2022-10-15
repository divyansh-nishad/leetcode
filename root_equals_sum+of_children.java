public class root_equals_sum+of_children {
    public boolean checkTree(TreeNode root) {
        return ((root.left.val+root.right.val)==root.val);
        
    }
    
}
