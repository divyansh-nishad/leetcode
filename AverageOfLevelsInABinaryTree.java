public class AverageOfLevelsInABinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> ans = new LinkedList<>();
        if (root == null)
            return ans;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            double avg = 0.0;
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                avg += queue.poll().val;
            }
            avg = avg / level;
            ans.add(avg);
        }
        return ans;
    }

}
