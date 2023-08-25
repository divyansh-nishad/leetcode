public class InterleavingString {
    private boolean dfs(String s1, String s2, String s3, int i, int j, int k, boolean[][] visited){
        if(i == s1.length() && j == s2.length()) return true;
        if(i > s1.length() || j > s2.length()) return false;
        if(visited[i][j]) return false;
        visited[i][j] = true;
        boolean a = false, b = false;
        if(i < s1.length() && s1.charAt(i) == s3.charAt(k)){
            a = dfs(s1, s2, s3, i+1, j, k+1, visited);
        }
        if(j < s2.length() && s2.charAt(j) == s3.charAt(k)){
            b = dfs(s1, s2, s3, i, j+1, k+1, visited); 
        }   
        return a || b;
    }
    
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length() < (s1.length() + s2.length()) || s3.length() > (s1.length() + s2.length())) return false;
        boolean[][] visited = new boolean[s1.length()+1][s2.length()+1];
        return dfs(s1, s2, s3, 0, 0, 0, visited);
    }
    
}
