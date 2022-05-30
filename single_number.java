public class single_number 
{
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        for(int i=0;i<l;i++)
        {
            if(hm.get(nums[i])==1)
                return nums[i];
        }
        return -1;
    }
    
}
