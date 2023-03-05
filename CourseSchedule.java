public class CourseSchedule {
    public boolean canFinish(int v, int[][] adj) {
        int[] in = new int[v];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < v; i++)
            list.add(new ArrayList<>());
        for (int[] it : adj) {
            list.get(it[1]).add(it[0]);
            in[it[0]]++;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < v; i++) {
            if (in[i] == 0)
                q.offer(i);
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            cnt++;
            for (int it : list.get(node)) {
                in[it]--;
                if (in[it] == 0)
                    q.offer(it);
            }
        }
        if (cnt == v)
            return true;
        return false;
    }

}
