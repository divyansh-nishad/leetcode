public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) 
    {
        if(root1==null && root2==null)
            return null;
        else if(root1==null)
        {
            return root2;
        }
        else if(root2==null)
        {
            return root1;
        }
        else
        {
            TreeNode temp=new TreeNode();
            temp.val=root1.val+root2.val;
            temp.left=mergeTrees(root1.left,root2.left);
            temp.right=mergeTrees(root1.right,root2.right);
            return temp;
        }
    }
    
}
