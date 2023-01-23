import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        return helper("", digits);
    }

    private List<String> helper(String p, String up) {

        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<String>();
            if (p.length() != 0)
                list.add(p);
            return list;
        } else {
            ArrayList<String> list = new ArrayList<String>();
            String[] alp = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
            String str = alp[Integer.parseInt("" + up.charAt(0)) - 1];
            for (int i = 0; i < str.length(); i++) {
                list.addAll(helper(p + str.charAt(i), up.substring(1)));
            }
            return list;
        }

    }
}
