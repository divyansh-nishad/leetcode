public class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {

    
}
class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> Integer.compare(b[0], a[0]));
        
        DSU alice = new DSU(n + 1);
        DSU bob = new DSU(n + 1);
        int removedEdges = 0, totalEdges = 0;
        
        for(int[] e : edges) {
            if(e[0] == 3) {
                boolean isEdgeValidForAlice = alice.union(e[1], e[2]);
                boolean isEdgeValidForBob = bob.union(e[1], e[2]);
                
                if(isEdgeValidForAlice) totalEdges++;
                if(isEdgeValidForBob) totalEdges++;
                
                if(!isEdgeValidForAlice || !isEdgeValidForBob) removedEdges++;
            } else if (e[0] == 1) {
                boolean isEdgeValidForAlice = alice.union(e[1], e[2]);
                if(isEdgeValidForAlice) 
                    totalEdges++;
                else
                    removedEdges++;
            } else {
                boolean isEdgeValidForBob = bob.union(e[1], e[2]);
                if(isEdgeValidForBob)  
                    totalEdges++;   
                else
                    removedEdges++;
            }
        }
        
        if(totalEdges != 2 * n - 2) return -1;//n - 1 for alice and n - 1 for bob
                
        return removedEdges;      
    }
}

class DSU {
    private int parent[];
    
    DSU(int n) {
        parent = new int[n];
        for(int i = 0; i < n; i++)
            parent[i] = i;
    }
    
    public int find(int x) {
        while(x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    
    public boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
            
        if(rootX == rootY) return false;
        
        parent[rootX] = rootY;
        return true;
    }
}