public class spiralMatrix {
    public int[][] generateMatrix(int n) 
    {
        int copy=n;
        int ar[][]=new int[n][n];
        int i=0,j=0;
        ar[i][j]=1;
        int c=1;
        int base=0;
        while(c!=(copy*copy))
        {
            while(j!=n-1)
            {
                j++;
                ar[i][j]=++c;
            }
            while(i!=n-1)
            {
                i++;
                ar[i][j]=++c;
            }
            while(j!=base)
            {
                j--;
                ar[i][j]=++c;
            }
            while(i>base+1)
            {
                i--;
                ar[i][j]=++c;
            }
            base++;
            n--;
        }
        return ar;
    }
    
}
