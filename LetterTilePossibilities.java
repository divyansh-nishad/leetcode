import java.util.*;

public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        return helper("", tiles).size() - 1;
    }

    private Set<String> helper(String p, String up) {
        if (up.length() == 0) {
            Set<String> set = new LinkedHashSet<String>();
            set.add(p);
            return set;
        } else {
            Set<String> set = new LinkedHashSet<String>();
            set.addAll(helper(p, up.substring(1)));
            char ch = up.charAt(0);
            for (int i = 0; i <= p.length(); i++) {
                String f = p.substring(0, i);
                String l = p.substring(i);
                set.addAll(helper(f + ch + l, up.substring(1)));
            }
            return set;
        }
    }

}
