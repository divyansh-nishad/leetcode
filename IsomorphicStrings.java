import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if (t.length() != n)
            return false;
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!hm1.containsKey(ch1)) {
                hm1.put(ch1, ch2);
            }
            if (!hm2.containsKey(ch2)) {
                hm2.put(ch2, ch1);
            }
            if (hm1.get(ch1) != ch2 || hm2.get(ch2) != ch1)
                return false;
        }
        return true;
    }

}
