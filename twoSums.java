class twoSums 
{
    public int[] twoSum(int[] nums, int target) 
    {
       int len=nums.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                        return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
        
    }
}