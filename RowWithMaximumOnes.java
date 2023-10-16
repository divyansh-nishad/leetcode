public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int cnt = 0;
        int ans[] = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int arr[] = mat[i];
            int row_cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                row_cnt += arr[j];
            }
            if (row_cnt > cnt) {
                cnt = row_cnt;
                ans[1] = cnt;
                ans[0] = i;
            }
        }
        return ans;
    }
}
