public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int cols = matrix[0].length;
        int start = 0;
        int end = matrix.length * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int r = mid / cols;
            int c = mid % cols;
            if (target == matrix[r][c]) {
                return true;
            }
            if (target < matrix[r][c]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

}
