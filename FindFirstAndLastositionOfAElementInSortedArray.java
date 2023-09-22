public class FindFirstAndLastositionOfAElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int ans[] ={-1,-1};
        int first =-1;
        int second=-1;
        int lo=0,hi=nums.length-1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target)
            {
                second=mid;
                hi=mid-1;
            }
            else if(nums[mid]>target)
            {
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }
        }
        lo=0;hi=nums.length-1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target)
            {
                first=mid;
                lo=mid+1;
            }
            else if(nums[mid]<target)
            {
               lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
        }
        ans[1]=first;
        ans[0]=second;
        return ans;

    }
    
}
