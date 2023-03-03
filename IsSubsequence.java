public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        int j = 0;
        if (slen == 0)
            return true;
        if (tlen == 0)
            return false;
        for (int i = 0; i < tlen; i++) {
            if (s.charAt(j) == t.charAt(i))
                j++;
            if (j == slen)
                return true;
        }
        return false;
    }

}
