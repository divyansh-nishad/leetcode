public class create_a_target_in_given_order 
{
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int[] target = new int[nums.length];
        int i = 0, k = 0;
	    while (i < index.length) 
        {
		    for (k = target.length - 1; k > index[i]; k--)
			    target[k] = target[k - 1];
		    target[index[i]] = nums[i];
		    i++;
	    }
        return target;
    }
    
}
