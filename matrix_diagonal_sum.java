public class matrix_diagonal_sum 
{
    public int diagonalSum(int[][] mat) 
    {
        int n=mat[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            count+=mat[i][i];
        }
        int i=0;int j=n-1;
        while(j>=0)
        {
            if(i==j)
            {
                i++;
                j--;
                continue;
            }
            count+=mat[i++][j--];
        }
        return count;
    }
    
}
