public class MinimumScoreOfPathBetweenTwoCities {
    public int minScore(int n, int[][] roads) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] road : roads) {
            int u = road[0], v = road[1], w = road[2];
            graph.computeIfAbsent(u, k -> new HashMap<>()).put(v, w);
            graph.computeIfAbsent(v, k -> new HashMap<>()).put(u, w);
        }

        int res = Integer.MAX_VALUE;
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Map.Entry<Integer, Integer> entry : graph.get(node).entrySet()) {
                int adj = entry.getKey(), score = entry.getValue();
                if (!visited.contains(adj)) {
                    queue.offer(adj);
                    visited.add(adj);
                }
                res = Math.min(res, score);
            }
        }

        return res;
    }

}
