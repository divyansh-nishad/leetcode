public class SerialiseAndDesrialiseBinaryTree {
    public String serialize(TreeNode root) {
        if (root == null)
            return "";
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                res.append("n ");
                continue;
            }
            res.append(node.val + " ");
            queue.add(node.left);
            queue.add(node.right);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "")
            return null;
        String[] value = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(value[0]));
        q.add(root);
        for (int i = 1; i < value.length; i++) {
            TreeNode parent = q.poll();
            if (!value[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(value[i]));
                parent.left = left;
                q.add(left);
            }
            if (!value[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(value[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }

}
