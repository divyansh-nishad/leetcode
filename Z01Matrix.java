public class Z01Matrix {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                else
                    vis[i][j]=0;
            }
        }
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            dist[row][col]=steps;
            for(int i=0;i<4;i++)
            {
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol,steps+1));
                }
            }
        }
        return dist;

    }
}
class Pair{
    int first;
    int second;
    int third;
    Pair(int a, int b, int c)
    {
        first=a;
        second=b;
        third=c;
    }
}
    

