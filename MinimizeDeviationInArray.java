import java.util.*;

public class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        int min = Integer.MAX_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length, Collections.reverseOrder());
        for (int num : nums) {
            if (num % 2 == 0) {
                pq.offer(num);
                min = Math.min(min, num);
            } else {
                pq.offer(num * 2);
                min = Math.min(min, num * 2);
            }
        }
        int ans = Integer.MAX_VALUE;
        while (pq.peek() % 2 == 0) {
            int n = pq.poll();
            ans = Math.min(ans, n - min);
            int m = n / 2;
            pq.offer(m);
            min = Math.min(min, m);
        }
        ans = Math.min(pq.peek() - min, ans);
        return ans;
    }

}
