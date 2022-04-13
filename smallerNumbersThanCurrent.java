class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int l=nums.length;
        int ret[] =new int[l];int i,j;
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                if(i!=j)
                {
                    if(nums[i]>nums[j])
                        ret[i]=ret[i]+1;
                }
            }
        }
        return ret;
        
    }
}