import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsBipartiteGraph {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (check(i, n, graph, color) == false)
                    return false;

            }
        }
        return true;
    }

    private boolean check(int start, int n, int graph[][], int color[]) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        color[start] = 0;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            for (int it : graph[node]) {
                // if the adjacent node is yet not colored
                // you will give the opposite color of the node
                if (color[it] == -1) {
                    color[it] = 1 - color[node];
                    q.add(it);
                }
                // is the adjacent guy having the same color
                // someone did color it on some other path
                else if (color[it] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

}
