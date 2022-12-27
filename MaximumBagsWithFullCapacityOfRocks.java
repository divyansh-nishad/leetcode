public class MaximumBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) 
    {
        int cnt=0;
        for(int i=0;i<rocks.length;i++)
        {
            rocks[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(rocks);
        for(int i=0;i<rocks.length;i++)
        {
            additionalRocks = additionalRocks - rocks[i];
            if(additionalRocks<0)
            break;
            cnt++;
        }
        return cnt;    
    }
    
}
