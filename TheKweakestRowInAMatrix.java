public class TheKweakestRowInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int arr[] = new int[rows];
        for (int i = 0; i < rows; i++) {
            int count1 = 0;
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    count1++;
                }
            }
            arr[i] = count1;
        }

        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            ans[i] = minIndex;
            arr[minIndex] = Integer.MAX_VALUE;
        }

        return ans;
    }
}
