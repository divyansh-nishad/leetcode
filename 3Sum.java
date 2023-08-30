public class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int mid = i+1;
            int hi = n-1;
            while(mid<hi)
            {
                int val=nums[i]+nums[mid]+nums[hi];
                if(val<0)
                {
                    mid++;
                }
                else if(val>0)
                {
                    hi--;
                }
                else
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[mid]);
                    list.add(nums[hi]);
                    ans.add(list);
                    mid++;
                    hi--;
                    while(mid<hi && nums[mid]==nums[mid-1])mid++;
                    while(mid<hi && nums[hi]==nums[hi+1]) hi--;
                }
            }
        }
        return ans;
    }
    
}
