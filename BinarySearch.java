class BinarySearch{
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0)
            return -1;
        int lo = 0, hi = nums.length-1;
        while(lo<=hi)
        {
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                hi = mid -1;
            }
            else
            {
                lo = mid+1;
            }
        }
        return -1;
    }
}