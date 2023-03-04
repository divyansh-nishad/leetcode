public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] visited = new int[numCourses];
        int[] dfsVis = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (isCyclic(i, adj, visited, dfsVis))
                    return new int[0];
            }
        }

        Stack<Integer> st = new Stack<>();
        Arrays.fill(visited, 0);
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                dfsSort(i, adj, visited, st);
            }
        }

        int[] topo = new int[numCourses];
        int ind = 0;
        while (!st.isEmpty()) {
            topo[ind++] = st.pop();

        }
        int[] rtopo = reverse(topo);
        return rtopo;
    }

    public int[] reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        return newArray;
    }

    public boolean isCyclic(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] dfsVis) {
        visited[node] = 1;
        dfsVis[node] = 1;

        for (Integer it : adj.get(node)) {
            if (visited[it] == 0) {
                if (isCyclic(it, adj, visited, dfsVis))
                    return true;
            } else if (dfsVis[it] == 1) {
                return true;
            }
        }
        dfsVis[node] = 0;
        return false;
    }

    public void dfsSort(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, Stack<Integer> st) {
        visited[node] = 1;

        for (Integer it : adj.get(node)) {
            if (visited[it] == 0) {
                dfsSort(it, adj, visited, st);
            }
        }
        // After call is over
        st.push(node);
    }

}
