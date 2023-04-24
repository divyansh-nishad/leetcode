public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        int p, q;
        while (pq.size() > 1) {
            p = pq.poll();
            q = pq.poll();
            // System.out.println(÷p+" "+q);
            pq.add(p - q);
        }
        return pq.poll();

    }

}
