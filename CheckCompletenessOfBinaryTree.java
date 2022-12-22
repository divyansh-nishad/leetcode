public class CheckCompletenessOfBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.peek() != null) {
            queue.offer(queue.peek().left);
            queue.offer(queue.peek().right);
            queue.poll();

        }
        while (!queue.isEmpty() && queue.peek() == null) {
            queue.poll();
        }
        return queue.isEmpty();
    }

}
