import java.util.*;

public class DeepestLeavesSum {
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return sum;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            sum = 0;
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                sum += queue.poll().val;
            }
        }
        return sum;
    }

}
