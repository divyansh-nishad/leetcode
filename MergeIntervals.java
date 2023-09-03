import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1))
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }

        }
        int newArr[][] = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            newArr[i][0] = ans.get(i).get(0);
            newArr[i][1] = ans.get(i).get(1);
        }
        return newArr;
    }

}
