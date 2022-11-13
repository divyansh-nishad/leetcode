public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null)
            return ans;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                list.add(queue.poll().val);
            }
            ans.add(list);
        }
        return ans;
    }

}
