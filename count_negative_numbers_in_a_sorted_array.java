public class count_negative_numbers_in_a_sorted_array {
    public int countNegatives(int[][] grid) {

        int c = 0;
        for (int i = 0, end = grid[i].length - 1; i < grid.length; i++) {
            int start = 0;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (grid[i][mid] < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            c = c + grid[i].length - start;
            end = start - 1;
        }
        return c;

    }

}
