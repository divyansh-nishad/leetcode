public class find_the_highest_altitude {

    public int largestAltitude(int[] gain) {
        int min=0; int max=0;
        for(int i=0;i<gain.length;i++)
        {
            min+=gain[i];
            if(max<min)
                max=min;
        }
        return max;
        
    }
    
}
