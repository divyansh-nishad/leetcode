import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindCriticalAndPsuedoCriticalEdgesInMinimumSpanningTree {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int[][][] graph = new int[n][n][2]; // {weight, index}
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            graph[from][to][0] = weight;
            graph[to][from][0] = weight;
            graph[from][to][1] = i;
            graph[to][from][1] = i;
        }

        List<Integer>[] minimumSpanningTree = new List[n];
        for (int i = 0; i < n; i++) {
            minimumSpanningTree[i] = new LinkedList<>();
        }

        boolean[] mstEdgeSet = new boolean[edges.length];

        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        buildMinimumSpanningTree(n, edges, mstEdgeSet, minimumSpanningTree, graph);

        List<List<Integer>> result = new ArrayList<>(2);
        Set<Integer> pseudoCriticalEdges = new HashSet<>();
        List<Integer> criticalEdges = new LinkedList<>();

        // Finding pseudo-critical edges
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0], to = edges[i][1];
            int weight = edges[i][2];
            int index = graph[from][to][1];
            if (!mstEdgeSet[index]) {
                Set<Integer> currentSet = new HashSet<>();
                boolean isPseudoCritical = isPath(from, to, weight, -1, minimumSpanningTree, graph, currentSet);
                if (isPseudoCritical && currentSet.size() > 0) {
                    pseudoCriticalEdges.addAll(currentSet);
                    pseudoCriticalEdges.add(index);
                }
            }
        }

        // Finding critical edges
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0], to = edges[i][1];
            int index = graph[from][to][1];
            if (mstEdgeSet[index] && !pseudoCriticalEdges.contains(index)) {
                criticalEdges.add(index);
            }
        }

        result.add(criticalEdges);
        result.add(new LinkedList<>(pseudoCriticalEdges));
        return result;
    }

    boolean isPath(int from, int to, int weight, int previous, List<Integer>[] minimumSpanningTree, int[][][] graph, Set<Integer> indices) {
        if (from == to) {
            return true;
        }
        for (int neighbor : minimumSpanningTree[from]) {
            if (previous != neighbor) {
                if (isPath(neighbor, to, weight, from, minimumSpanningTree, graph, indices)) {
                    if (graph[from][neighbor][0] == weight) {
                        indices.add(graph[from][neighbor][1]);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void buildMinimumSpanningTree(int n, int[][] edges, boolean[] mstEdgeSet, List<Integer>[] minimumSpanningTree, int[][][] graph) {
        int weight = 0;
        DisjointSet ds = new DisjointSet(n);

        for (int i = 0; i < edges.length; i++) {
            if (ds.union(edges[i][0], edges[i][1])) {
                weight += edges[i][2];
                int[] edge = edges[i];
                minimumSpanningTree[edge[0]].add(edge[1]);
                minimumSpanningTree[edge[1]].add(edge[0]);
                mstEdgeSet[graph[edge[0]][edge[1]][1]] = true;
            }
        }
    }
}

class DisjointSet {
    int[] parent;

    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int i) {
        return (i == parent[i]) ? i : (parent[i] = find(parent[i]));
    }

    public boolean union(int u, int v) {
        int pu = find(u), pv = find(v);
        if (pu == pv) {
            return false;
        }
        parent[pu] = pv;
        return true;
    }
    
}
