public class WordSearch {
    int[] di={1,0,0,-1};
    int[] dj={0,-1,1,0};
    public boolean exist(char[][] board, String word) 
    {
        boolean[] flag={false};
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean[][] visited=new boolean[board.length][board[0].length];
                    visited[i][j]=true;
                    helper(i,j,1,board,"",word,flag,visited);
                    visited[i][j]=false;
                }
            }
        }
        return flag[0];
    }
    private void helper(int i, int j, int pos, char[][] board, String cur, String word, boolean[] flag, boolean[][] visited)
    {
        if(pos==word.length())
        {
            // System.out.println(cur);
            // if(cur.equals(word))
            flag[0]=true;
            return;
        }
        for(int ind=0;ind<4;ind++)
        {
            int ni=i+di[ind];
            int nj=j+dj[ind];
            // System.out.println(cur);
            if(ni>=0 && nj>=0 && ni<board.length && nj<board[0].length && board[ni][nj]==word.charAt(pos) && !visited[ni][nj])
            {
                visited[i][j]=true;
                
                helper(ni,nj,pos+1,board,cur+board[i][j],word,flag,visited);
                visited[i][j]=false;
            }
        }
    }
}
