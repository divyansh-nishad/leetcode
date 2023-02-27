import java.util.*;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        List<Integer> list = new ArrayList<>();
        helper(ans, list, root, targetSum);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, TreeNode root, int target) {
        list.add(root.val);
        if (root.left == null && root.right == null)
            if (target == root.val)
                ans.add(new ArrayList<>(list));
        if (root.left != null)
            helper(ans, list, root.left, target - root.val);
        if (root.right != null)
            helper(ans, list, root.right, target - root.val);
        list.remove(list.size() - 1);
    }

}
