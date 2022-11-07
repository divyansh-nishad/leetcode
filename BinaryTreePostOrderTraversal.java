public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                result.addFirst(p.val);  
                p = p.right;             
            } else {
                TreeNode node = stack.pop();
                p = node.left;           
            }
        }
        return result;
    }    
}
