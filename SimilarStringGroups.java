public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(strs, visited, i);
                count++;
            }
        }
        
        return count;
    }
    
    private void dfs(String[] strs, boolean[] visited, int i) {
        visited[i] = true;
        
        for (int j = 0; j < strs.length; j++) {
            if (!visited[j] && isSimilar(strs[i], strs[j])) {
                dfs(strs, visited, j);
            }
        }
    }
    
    private boolean isSimilar(String s1, String s2) {
        int diff = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
            if (diff > 2) {
                return false;
            }
        }
        
        return true;
    }
    
}
