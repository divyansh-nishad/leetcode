public class CountUnreachablePairOfNodeInAUndirectedGraph {
    public long countPairs(int n, int[][] edges) {
        // Build the adjacency list of the graph
        List<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList[u].add(v);
            adjList[v].add(u);
        }

        boolean[] visited = new boolean[n];
        int[] sizes = new int[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                sizes[i] = dfs(i, adjList, visited);
            }
        }

        long ans = 0;
        long sum = 0;
        for (int size : sizes) {
            ans += sum * size;
            sum += size;
        }

        return ans;
    }

    private int dfs(int u, List<Integer>[] adjList, boolean[] visited) {
        visited[u] = true;
        int size = 1;
        for (int v : adjList[u]) {
            if (!visited[v]) {
                size += dfs(v, adjList, visited);
            }
        }
        return size;
    }
    
}
