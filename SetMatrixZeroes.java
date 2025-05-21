public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int col[] = new int[matrix[0].length];
        int row[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    col[j] = 1;
                    row[i] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}


//new solution
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> m = new HashSet<>();
        Set<Integer> n = new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int val = matrix[i][j];
                if (val==0)
                {
                    m.add(i);
                    n.add(j);
                }
            }
        }
        
        for(int j:n)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][j] = 0;
            }
        }
        for(int i:m)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j] = 0;
            }
        }
    }
}