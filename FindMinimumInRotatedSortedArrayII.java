public class FindMinimumInRotatedSortedArrayII {
        public int findMin(int[] nums) {
            int lo =0;
            int hi =nums.length-1;
            int min = Integer.MAX_VALUE;
            while(lo<=hi)
            {
                int mid = lo + (hi-lo)/2;
                if(nums[lo]==nums[mid]&& nums[mid]==nums[hi] && lo!=hi && lo!=mid)
                {
                    lo++;
                    hi--;
                }
                else if(nums[lo]<=nums[mid])
                {
                    min = Math.min(min,nums[lo]);
                    lo=mid+1;
                }
                else if(nums[mid]<=nums[hi])
                {
                    min = Math.min(nums[mid],min);
                    hi=mid-1;
                }
    
            }
            return min;
        }
    
    
}
