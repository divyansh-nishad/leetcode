import java.util.*;
public class MinimumCostToReportToTheCapital {
        private List<Integer>[] adj;    // adjacency list
        private long fuel = 0;          // total fuel required
        public long minimumFuelCost(int[][] roads, int seats) {
            int n = roads.length + 1;
            adj = new List[n];
            // populate adjacency list
            for (int i = 0; i < n; i++) { 
                adj[i] = new ArrayList<>();
            }
            for (int[] r : roads) {
                adj[r[0]].add(r[1]);
                adj[r[1]].add(r[0]);
            }
    
            dfs(0, -1, seats);  
            return fuel;        
        }
    
        
        private int dfs(int node, int parent, int seats) {
            int people = 1; 
            for (int child : adj[node]) {
                if (child == parent) {  
                    continue;    // skip
                }
                people += dfs(child, node, seats);
            } 
            if (node != 0) {
                fuel += Math.ceil(people * 1.0 / seats);
            }
    
            return people;
        }
    }