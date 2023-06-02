public class DetonateTheMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        int output = 0;
        Queue<int[]> data = new LinkedList<>();
        for (int i = 0; i < bombs.length; i++) {
            boolean check[] = new boolean[bombs.length];
            data.add(bombs[i]);
            int count = 1;
            while (!data.isEmpty()) {
                int t[] = data.remove();
                for (int j = 0; j < bombs.length; j++)
                    if (!check[j] && i != j) {
                        double cal = Math.sqrt(Math.pow(t[0] - bombs[j][0], 2) + Math.pow(t[1] - bombs[j][1], 2));
                        if (cal <= (double) t[2]) {
                            count++;
                            check[j] = true;
                            data.add(bombs[j]);
                        }
                    }
            }
            output = Math.max(output, count);
        }
        return output;
    }

}
