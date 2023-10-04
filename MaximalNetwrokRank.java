import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximalNetwrokRank {
    class Solution {
        public int maximalNetworkRank(int n, int[][] roads) {
            int degrees[] = new int[n];
            for(int arr[]:roads)
            {
                int a =arr[0];
                int b = arr[1];
                degrees[a]+=1;
                degrees[b]+=1;
            }
            Set<Integer> uniqueDegrees = new HashSet<>();
            for(int degree:degrees)
            {
                uniqueDegrees.add(degree);
            }
    
            List<Integer> sortedDegrees = new ArrayList<>(uniqueDegrees);
            Collections.sort(sortedDegrees, Collections.reverseOrder());
    
            int maxDeg = sortedDegrees.get(0);
            int secondMaxDeg = sortedDegrees.size()>1?sortedDegrees.get(1):0
    ;
            int maxCount =0;
            for(int degree:degrees)
            {
                if(degree==maxDeg)
                    maxCount++;
            }
            int secondMaxCount = 0;
            for(int degree:degrees)
            {
                if(degree==secondMaxDeg)
                    secondMaxCount++;
            }
            if (maxCount > 1) {
                int directlyConnected = 0;
                for (int[] road : roads) {
                    if (degrees[road[0]] == maxDeg && degrees[road[1]] == maxDeg)
                        directlyConnected++;
                }
                int possibleConnections = maxCount * (maxCount - 1) / 2;
                return possibleConnections == directlyConnected ? 2 * maxDeg - 1 : 2 * maxDeg;
            }
    
            int directConnectionsToSecond = 0;
            for (int[] road : roads) {
                if ((degrees[road[0]] == maxDeg && degrees[road[1]] == secondMaxDeg) ||
                    (degrees[road[0]] == secondMaxDeg && degrees[road[1]] == maxDeg))
                    directConnectionsToSecond++;
            }
    
            return secondMaxCount == directConnectionsToSecond ? maxDeg + secondMaxDeg - 1 : maxDeg + secondMaxDeg;
        }
    }   
    
}
