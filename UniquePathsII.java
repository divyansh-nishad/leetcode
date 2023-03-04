public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n=  obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1)
            return 0;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0 && j==0))
                    dp[i][j]=1;
                else
                {
                    if(i>0 && obstacleGrid[i-1][j]!=1)
                        dp[i][j]+=dp[i-1][j];
                    if(j>0 && obstacleGrid[i][j-1]!=1)
                        dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    // int m,n;
    // int[][] grid;
    // public int recurse(int i, int j) {
    //     if(i==m || j==n || grid[i][j]==1)
    //         return 0;
    //     if(m-1==i && j==n-1)
    //         return 1;
    //     return recurse(i, j+1)+recurse(i+1, j);
    // }
    // public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //     m = obstacleGrid.length;
    //     n = obstacleGrid[0].length;
    //     grid = obstacleGrid;
    //     return recurse(0, 0);
    // }
    // public int uniquePaths(int m, int n) {
    //     int dp[][] = new int[m][n];
    //     for(int i=0;i<m;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             if(i==0 || j==0)
    //                 dp[i][j]=1;
    //             else
    //             {
    //                 dp[i][j]=dp[i-1][j]+dp[i][j-1];
    //             }
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }
    
}
