public class FindtheLongestValidObstacleCourseatEachPosition {
    public int[] longestObstacleCourseAtEachPosition(int[] A) {
        int n = A.length, length = 0, res[] = new int[n], mono[] = new int[n];
        for (int i = 0; i < n; ++i) {
            int l = 0, r = length;
            while (l < r) {
                int m = (l + r) / 2;
                if (mono[m] <= A[i])
                    l = m + 1;
                else
                    r = m;
            }
            res[i] = l + 1;
            if (length == l)
                length++;
            mono[l] = A[i];
        }
        return res;
    }
    
}
