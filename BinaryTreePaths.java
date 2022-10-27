public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) 
    {
        String path="";
        return helper("", root);
    }
    private List<String> helper(String path, TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            ArrayList<String> list=new ArrayList<String>();
            if(!path.equals(""))
            list.add(path+"->"+root.val);
            else
                list.add(path+root.val);
            return list;
        }
        else
        {
            ArrayList<String> list=new ArrayList<String>();
            if(root.left!=null)
            {
                if(!path.equals(""))
                    list.addAll(helper(path+"->"+root.val,root.left));
                else
                    list.addAll(helper(path+root.val,root.left));
            }
            if(root.right!=null)
            {
                if(!path.equals(""))
                    list.addAll(helper(path+"->"+root.val,root.right));
                else
                    list.addAll(helper(path+root.val,root.right));
            }
            return list;
        }
    }
    
}
