import java.util.*;

public class generateParantheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        helper(ans, "", 0, 0, n);
        return ans;
    }

    private void helper(List<String> list, String str, int open, int close, int n) {
        if (str.length() == 2 * n) {
            list.add(str);
            return;
        }
        if (open < n) {
            helper(list, str + "(", open + 1, close, n);
        }
        if (close < open) {
            helper(list, str + ")", open, close + 1, n);
        }
    }

}