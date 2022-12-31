import java.util.*;
public class MinimumNumberOfVerticesToReachAllNode {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[n + 1];
        for (List<Integer> lis : edges)
            vis[lis.get(1)] = true;
        for (int i = 0; i < n; i++)
            if (vis[i] == false)
                ans.add(i);
        return ans;
    }

}
