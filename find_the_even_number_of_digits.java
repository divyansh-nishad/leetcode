public class find_the_even_number_of_digits 
{
    public int findNumbers(int[] nums) 
    {
        int len=nums.length;
        String k="";int c=0;
        for(int i=0;i<len;i++)
        {
            k=Integer.toString(nums[i]);
            if(k.length()%2==0)
                c++;
        }
        return c;
    }
    
}
