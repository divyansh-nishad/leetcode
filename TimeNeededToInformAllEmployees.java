public class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) if (manager[i] != -1) graph[manager[i]].add(i);
        Queue<int[]> q = new LinkedList<>(); // Since it's a tree, we don't need `visited` array
        q.offer(new int[]{headID, 0});
        int ans = 0;
        while (!q.isEmpty()) {
            int[] top = q.poll();
            int u = top[0], w = top[1];
            ans = Math.max(w, ans);
            for (int v : graph[u]) q.offer(new int[]{v, w + informTime[u]});
        }
        return ans;
    }
    
}
