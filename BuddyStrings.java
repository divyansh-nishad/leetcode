import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if (m != n) {
            return false;
        }
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<Character>();
            for (char c : s.toCharArray())
                set.add(c);
            return set.size() < s.length();
        }
        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != goal.charAt(i))
                dif.add(i);
        return dif.size() == 2 && s.charAt(dif.get(0)) == goal.charAt(dif.get(1))
                && s.charAt(dif.get(1)) == goal.charAt(dif.get(0));
    }

}
