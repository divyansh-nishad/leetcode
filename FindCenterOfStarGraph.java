public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
        //the center node of the graph will be common to all the edges
    }
    
}
