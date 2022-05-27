public class maximum_subarray 
{
    public int maxSubArray(int[] nums) {
        int l=nums.length;
        int max_so_far=Integer.MIN_VALUE,max_ending_here=0;
        for(int i=0;i<l;i++)
        {
            max_ending_here= max_ending_here+nums[i];
            if(max_so_far<max_ending_here)
                max_so_far=max_ending_here;
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return max_so_far;
    }
    
}
