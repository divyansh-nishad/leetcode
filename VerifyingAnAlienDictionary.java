import java.util.*;

public class VerifyingAnAlienDictionary {

    Map<Character, Integer> map;

    public boolean isAlienSorted(String[] words, String order) {
        map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!compare(words[i], words[i + 1]))
                return false;
        }
        return true;
    }

    private boolean compare(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        for (int i = 0, j = 0; i < l1 && j < l2; i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (map.get(s1.charAt(i)) > map.get(s2.charAt(j))) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        if (l1 > l2)
            return false;
        return true;
    }
}
