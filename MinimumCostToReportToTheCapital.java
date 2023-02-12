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
    
            dfs(0, -1, seats);  // call dfs
            return fuel;        // return the answer
        }
    
        // dfs method to compute the number of people to be transported from each node
        private int dfs(int node, int parent, int seats) {
            int people = 1; // we have 1 representative at the current node
            // we will look for more representatives in the children nodes
            for (int child : adj[node]) {
                // don't wanna go back to parent node
                if (child == parent) {  
                    continue;    // skip
                }
                // call dfs to get the number of people down below, and add them to total people
                people += dfs(child, node, seats);
            } 
            // if we are not at the captial (node 0)
            if (node != 0) {
                // say we have 3 leaf nodes below, and car capacity is 2
                // each of them would come in one car with 1 vacant seat in each car
                // now when all of them have met, we would accommodate them and fill the cars
                // We have 3 people in total and each car has 2 seats, 
                // so we would make 2 people sit in one car and its full
                // we are left with one more person, and we would send them to another car
                // so now we are using only 2 cars, while all of them came on 3 cars
                // So ceil(3 people / 2 seats) = 2 cars
                // Why adding number of cars to fuel? Because each car consumes 1 litre of fuel
                // say from children we had 3 cars, they consumed 3 liters, so fuel += 3
                // then we had 2 cars (after adjustment), which would consume 2 litres
                // when going back to its parent, so fuel += 2
                fuel += Math.ceil(people * 1.0 / seats);
            }
    
            // return the total number of people at the current node (subtree)
            return people;
        }
    }