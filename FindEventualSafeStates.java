import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;
        boolean vis[] = new boolean[n];
        boolean pathVis[] = new boolean[n];
        boolean check[] = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                dfs(vis, pathVis, check, graph, i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (check[i] == true)
                ans.add(i);
        }
        return ans;
    }

    private boolean dfs(boolean[] vis, boolean[] pathVis, boolean[] check, int[][] graph, int node) {
        vis[node] = true;
        pathVis[node] = true;
        check[node] = false;
        for (int it : graph[node]) {
            if (vis[it] == false) {
                if (dfs(vis, pathVis, check, graph, it) == true) {
                    check[node] = false;
                    return true;
                }
            } else if (pathVis[it] == true) {
                check[node] = false;
                return true;
            }

        }
        pathVis[node] = false;
        check[node] = true;
        return false;

    }

}
