import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int cnt=1;
                int cur=i;
                while(set.contains(cur+1))
                {
                    cnt+=1;
                    cur+=1;
                }
                max= Math.max(max,cnt);
            }
        }
        return max;
    }
    
}
