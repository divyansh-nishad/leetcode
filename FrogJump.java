import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrogJump {
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> dp = new HashMap();
        
        for(int val: stones) dp.put(val, new HashSet());
        dp.get(stones[0]).add(1);
        
        for(int val: stones){
            for(int jump: dp.get(val)){
                if(jump!= 0 && dp.containsKey(val+jump)){
                    dp.get(val+jump).add(jump-1);
                    dp.get(val+jump).add(jump);
                    dp.get(val+jump).add(jump+1);
                }
            }
        }
        
        return !dp.get(stones[stones.length-1]).isEmpty();
    }
}
