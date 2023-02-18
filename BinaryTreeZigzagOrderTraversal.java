import java.util.*;

public class BinaryTreeZigzagOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null)
            return ans;
        queue.offer(root);
        boolean ltf = true;
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> res = new LinkedList<Integer>();
            for (int i = 0; i < level; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                if (ltf)
                    res.add(queue.poll().val);
                else
                    res.add(0, queue.poll().val);
            }
            ans.add(res);
            ltf = !ltf;
        }
        return ans;
    }

}
