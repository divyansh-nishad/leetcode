public class min_depth_of_tree 
{
    public int minDepth(TreeNode root) 
    {
        if(root==null)
            return 0;
        else
        {
            int left=minDepth(root.left);
            int right=minDepth(root.right);
            if(left==0||right==0)
                return left+right+1;
            else
                return(Math.min(left,right)+1);
        }
        
    }
    
}
