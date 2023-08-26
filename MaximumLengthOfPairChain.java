public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int[] pair : pairs) {
            pq.offer(pair);
        }
        int max = 0;
        int cur = Integer.MIN_VALUE;
        while (!pq.isEmpty()) {
            if (pq.peek()[0] <= cur) {
                pq.poll();
            } else {
                max++;
                cur = pq.poll()[1];
            }
        }
        return max;
    }

}
