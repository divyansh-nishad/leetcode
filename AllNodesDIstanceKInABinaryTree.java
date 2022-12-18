public class AllNodesDIstanceKInABinaryTree {
    private void markParents(Map<TreeNode, TreeNode> parent, TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left != null) {
                parent.put(current.left, current);
                queue.offer(current.left);
            }
            if (current.right != null) {
                parent.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        markParents(parent, root);
        Map<TreeNode, Boolean> vis = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        vis.put(target, true);
        int cur = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (cur == k)
                break;
            cur++;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null && vis.get(current.left) == null) {
                    queue.offer(current.left);
                    vis.put(current.left, true);
                }
                if (current.right != null && vis.get(current.right) == null) {
                    queue.offer(current.right);
                    vis.put(current.right, true);
                }
                if (parent.get(current) != null && vis.get(parent.get(current)) == null) {
                    queue.offer(parent.get(current));
                    vis.put(parent.get(current), true);
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            list.add(current.val);
        }
        return list;
    }

}
