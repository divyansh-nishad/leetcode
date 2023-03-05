public class JumpGamwIV {
    public int minJumps(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        Set<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        vis.add(0);
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int pop = q.poll();
                if (pop == arr.length - 1)
                    return count;
                if (pop > 0 && vis.add(pop - 1))
                    q.add(pop - 1);
                if (pop < arr.length - 1 && vis.add(pop + 1))
                    q.add(pop + 1);
                if (map.containsKey(arr[pop])) {
                    for (int index : map.get(arr[pop])) {
                        if (vis.add(index)) {
                            q.add(index);
                        }
                    }
                    map.remove(arr[pop]);
                }
            }
            count++;
        }
        return -1;
    }

}
