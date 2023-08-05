public class UniqueBinarySearchTreeII {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        if (start > end) {
            trees.add(null);
            return trees;
        }

        for (int rootValue = start; rootValue <= end; rootValue++) {
            List<TreeNode> leftSubTrees = generateTrees(start, rootValue - 1);
            List<TreeNode> rightSubTrees = generateTrees(rootValue + 1, end);

            for (TreeNode leftSubTree : leftSubTrees) {
                for (TreeNode rightSubTree : rightSubTrees) {
                    TreeNode root = new TreeNode(rootValue);
                    root.left = leftSubTree;
                    root.right = rightSubTree;
                    trees.add(root);
                }
            }
        }
        return trees;
    }

}
