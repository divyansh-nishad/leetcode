public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                String ans = "";
                for (int j = 0; j < m; j++) {
                    ans += (subS);
                }
                if (ans.equals(s))
                    return true;
            }
        }
        return false;
    }

}
