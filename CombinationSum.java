public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        helper(ans, list, candidates, target, 0);
        return ans.stream().distinct().collect(Collectors.toList());
    }
    private void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start)
    {
        if(remain < 0) 
            return;
        else if(remain == 0) 
            list.add(new ArrayList<>(tempList));
        else
        { 
            for(int i = start; i < nums.length; i++)
            {
                tempList.add(nums[i]);
                helper(list, tempList, nums, remain - nums[i], i); 
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    
}
