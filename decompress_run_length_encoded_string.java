public class decompress_run_length_encoded_string {
    public int[] decompressRLElist(int[] nums) 
    {
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2)
        {
            int f=nums[i];
            int val=nums[i+1];
            while(f!=0)
            {
                li.add(val);
                f--;
            }
        }
        int[] arr = new int[li.size()];
        for (int i = 0; i < li.size(); i++)
            arr[i] = li.get(i);
        return arr;
    }
    
}
