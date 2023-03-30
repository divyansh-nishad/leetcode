import java.util.*;

class ScrambleString {
    Map<String, Boolean> mp = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        if (s1.equals(s2))
            return true;
        if (n == 1)
            return false;

        String key = s1 + " " + s2;

        if (mp.containsKey(key))
            return mp.get(key);

        for (int i = 1; i < n; i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))) {
                mp.put(key, true);
                return true;
            }

            if (isScramble(s1.substring(0, i), s2.substring(n - i))
                    && isScramble(s1.substring(i), s2.substring(0, n - i))) {
                mp.put(key, true);
                return true;
            }
        }

        mp.put(key, false);
        return false;
    }
}