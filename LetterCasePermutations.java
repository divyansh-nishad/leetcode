import java.util.*;
public class LetterCasePermutations {
    public List<String> letterCasePermutation(String s) {
        int n=s.length();
        s=s.toLowerCase();
        List<String> ans=new ArrayList<>();
        helper(ans, 0, "", n, s);
        return ans;        
    }
    private void helper(List<String> ans, int ind, String res, int n, String s)
    {
        if(ind==n)
        {
            ans.add(res);
            return;
        }
        else
        {
            char ch=s.charAt(ind);
            if(Character.isLetter(ch))
                helper(ans, ind+1, res + Character.toUpperCase(ch), n, s);
            helper(ans, ind+1, res + (ch), n, s);
        }
    }
    
}
