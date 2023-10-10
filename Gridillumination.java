import java.util.HashMap;
import java.util.Map;

public class Gridillumination {
    class Solution {
        int[][] dir = {{0, 1},{1, 0},{0, -1},{-1, 0},{-1, 1},{1, 1},{1, -1},{-1, -1},{0, 0}};
        public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {
            Map<Integer, Boolean> lamp = new HashMap<Integer, Boolean>();
            Map<Integer, Integer> row = new HashMap<Integer, Integer>();
            Map<Integer, Integer> col = new HashMap<Integer, Integer>();
            Map<Integer, Integer> diagTopLeft = new HashMap<Integer, Integer>();
            Map<Integer, Integer> diagBottomLeft = new HashMap<Integer, Integer>();
            for (int i = 0; i < lamps.length; ++i) {
                int x = lamps[i][0];
                int y = lamps[i][1];
                if(lamp.getOrDefault(x * N + y, false))
                    continue;
                row.put(x, row.getOrDefault(x, 0) + 1);
                col.put(y, col.getOrDefault(y, 0) + 1);
                diagTopLeft.put(x - y, diagTopLeft.getOrDefault(x - y, 0) + 1);
                diagBottomLeft.put(x + y, diagBottomLeft.getOrDefault(x + y, 0) + 1);
                lamp.put(x * N + y, true);
            }
            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int x = queries[i][0];
                int y = queries[i][1];
                ans[i] = (row.getOrDefault(x, 0) > 0 ||
                          col.getOrDefault(y, 0) > 0 ||
                          diagTopLeft.getOrDefault(x - y, 0) > 0 ||
                          diagBottomLeft.getOrDefault(x + y, 0) > 0) ? 1 : 0;
                for (int j = 0; j < dir.length; j++) {
                    int r = x + dir[j][0];
                    int c = y + dir[j][1];
                    if (r >= 0 && c >= 0 && r < N && c < N && lamp.getOrDefault(r * N + c, false) == true) { //lamp.containsKey(r * N + c)
                        // System.out.println("Bulb : " + r + " " + c);
                        row.put(r, row.getOrDefault(r, 1) - 1);
                        col.put(c, col.getOrDefault(c, 1) - 1);
                        diagTopLeft.put(r - c, diagTopLeft.getOrDefault(r - c, 1) - 1);
                        diagBottomLeft.put(r + c, diagBottomLeft.getOrDefault(r + c, 1) - 1);
                        lamp.put(r * N + c, false);
                    }
                }
            }
            return ans;
        }
    }
    
}
