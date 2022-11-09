public class UniquePathIII {
    int[] di={1,0,0,-1};
    int[] dj={0,-1,1,0};
    public int uniquePathsIII(int[][] grid) {
        int[] ans={0};
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                    c++;
            }
        }
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    visited[i][j]=true;
                    helper(i,j,0,grid,ans,visited,c);
                    visited[i][j]=false;
                }
            }
        }
        return ans[0];
    }
    private void helper(int i, int j,int tr ,int[][] grid, int[] ans,boolean[][] visited, int c)
    {
        if(grid[i][j]==2 && tr==c+1)
        {
            ans[0]++;
            return;
        }
        else
        {
            for(int ind=0;ind<4;ind++)
            {
                int ni=i+di[ind];
                int nj=j+dj[ind];
                if(ni>=0 && nj>=0 && ni<grid.length && nj<grid[0].length && (grid[ni][nj]==0 ||grid[ni][nj]==2) && !visited[ni][nj])
                {
                    visited[i][j]=true;
                    helper(ni,nj,tr+1,grid,ans,visited,c);
                    visited[i][j]=false;
                }
            }
        }
    }
}
