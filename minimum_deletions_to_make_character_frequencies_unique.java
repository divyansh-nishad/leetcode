import java.util.*;

public class minimum_deletions_to_make_character_frequencies_unique {
    public int minDeletions(String s) {
        int count = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            hm.put(ch[i], hm.getOrDefault(ch[i], 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (char c : hm.keySet()) {
            int freq = hm.get(c);
            if (!set.contains(freq))
                set.add(freq);
            else {
                while (freq > 0 && set.contains(freq)) {
                    freq--;
                    count++;
                }
                if (freq > 0)
                    set.add(freq);
            }
        }
        return count;

    }

}
