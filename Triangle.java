public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = Integer.MAX_VALUE;
        int n = triangle.size();
        int front[] = new int[n];
        for (int i = 0; i < n; i++) {
            front[i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            int cur[] = new int[n];
            for (int j = i; j >= 0; j--) {
                int d = triangle.get(i).get(j) + front[j];
                int dg = triangle.get(i).get(j) + front[j + 1];
                cur[j] = Math.min(d, dg);
            }
            front = cur;
        }
        return front[0];
    }

    /*
     * // tabulation dynamic programming
     * public int minimumTotal(List<List<Integer>> triangle) {
     * int min = Integer.MAX_VALUE;
     * int n = triangle.size();
     * int dp[][] = new int[n][n];
     * for (int i = 0; i < n; i++) {
     * dp[n - 1][i] = triangle.get(n - 1).get(i);
     * }
     * for (int i = n - 2; i >= 0; i--) {
     * for (int j = i; j >= 0; j--) {
     * int d = triangle.get(i).get(j) + dp[i + 1][j];
     * int dg = triangle.get(i).get(j) + dp[i + 1][j + 1];
     * dp[i][j] = Math.min(d, dg);
     * }
     * }
     * return dp[0][0];
     * }
     */

    /*
     * Given a triangle, find the minimum path sum from top to bottom. Each step you
     * may move to adjacent numbers on the row below.
     * 
     * For example, given the following triangle
     * 
     * [
     * [2],
     * [3,4],
     * [6,5,7],
     * [4,1,8,3]
     * ]
     * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
     * 
     * Note:
     * 
     * Bonus point if you are able to do this using only O(n) extra space, where n
     * is the total number of rows in th
     */
    /*
     * Normal recursive solution
     * 
     * public int minimumTotal(List<List<Integer>> triangle) {
     * return helper(triangle,0,0,triangle.size());
     * }
     * private int helper(List<List<Integer>> grid, int i, int j, int l)
     * {
     * if(i==l-1)
     * return grid.get(i).get(j);
     * int d = grid.get(i).get(j) + helper(grid, i+1, j,l);
     * int dg = grid.get(i).get(j) + helper(grid, i+1, j+1,l);
     * return Math.min(d,dg);
     * }
     */
    /*
     * Memoization Solution
     * public int minimumTotal(List<List<Integer>> triangle) {
     * int n= triangle.size();
     * int dp[][] = new int[n][n];
     * return helper(triangle,0,0,triangle.size(),dp);
     * }
     * private int helper(List<List<Integer>> grid, int i, int j, int l, int[][] dp)
     * {
     * if(i==l-1)
     * return dp[i][j]=grid.get(i).get(j);
     * if(dp[i][j]!=0)
     * return dp[i][j];
     * int d = grid.get(i).get(j) + helper(grid, i+1, j,l,dp);
     * int dg = grid.get(i).get(j) + helper(grid, i+1, j+1,l,dp);
     * return dp[i][j]=Math.min(d,dg);
     * }
     */
}
