import java.util.*;

public class jewels_and_stones {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = stones.length();
        for (int i = 0; i < l; i++) {
            char ch = stones.charAt(i);
            if (map.containsKey(ch))
                map.put(ch, (map.get(ch) + 1));
            else
                map.put(ch, 1);
        }
        int c = 0;
        l = jewels.length();
        for (int i = 0; i < l; i++) {
            if (map.get(jewels.charAt(i)) != null)
                c = c + map.get(jewels.charAt(i));
        }
        return c;
    }
}
