public class transpose_of_matrix 
{
    public int[][] transpose(int[][] matrix) 
    {
        int a=matrix.length;
        int b=matrix[0].length;
        int mat[][]=new int[b][a];
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<a;j++)
                mat[i][j]=matrix[j][i];
        }
        return mat;
    }
    
}
