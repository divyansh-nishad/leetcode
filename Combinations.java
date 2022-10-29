public class Combinations {
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> list =  new ArrayList<>();
        helper(list, new ArrayList<>(), 1, n, k);
        return list;
    }
    private void helper(List<List<Integer>> result, List<Integer> list, int start , int n, int k)
    {
        if(k==0)
        {
            result.add(new ArrayList<>(list));
        }
        else
        {
            for(int i=start;i<=n;i++)
            {
                list.add(i);
                helper(result,list,i+1,n,k-1);
                list.remove(list.size()-1);
            }
        }
    }
    
}
