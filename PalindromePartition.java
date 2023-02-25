import java.util.*;

public class PalindromePartition {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        helper(0, s, list, ans);
        return ans;
    }

    private boolean isPalin(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    private void helper(int ind, String s, List<String> list, List<List<String>> ans) {
        if (ind == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isPalin(s, ind, i)) {
                list.add(s.substring(ind, i + 1));
                helper(i + 1, s, list, ans);
                list.remove(list.size() - 1);
            }
        }
        return;
    }

}
