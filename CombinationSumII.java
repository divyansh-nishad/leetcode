import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(candidates);
        helper(0, candidates, target, list, ans);
        return new ArrayList<>(ans);
    }
    private void helper(int i, int[] arr, int target, List<Integer> list, Set<List<Integer>> ans)
    {
        if (target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j=i;j<arr.length;j++)
        {
            if(j>i && arr[j] == arr[j-1])
                continue;

            if(arr[i]>target)
                break;

            list.add(arr[j]);
            helper(j+1, arr, target-arr[j], list, ans);
            list.remove(list.size()-1);
        }

    }
}
