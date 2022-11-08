public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans= new ArrayList<>();
        helper(ans,"",0, s, wordDict);
        return ans;
    }
    private void helper(List<String> ans,String cur, int pos, String s, List<String> wordDict)
    {
        if(pos==s.length())
        {
            ans.add(cur.trim());
            return;
        }
        else if(pos>s.length())
            return;
        else
        {
            for(int i=pos;i<=s.length();i++)
            {
                String f=s.substring(pos,i);
                if(wordDict.contains(f))
                {
                    helper(ans, cur+" "+f, i, s, wordDict);   
                }
            }
        }
    }
    
}
