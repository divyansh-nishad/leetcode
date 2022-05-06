import java.util.*;

public class shuffle_string {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            map.put(indices[i], s.charAt(i));
        }
        String k = "";
        for (int i = 0; i < l; i++) {
            k = k + map.get(i);
        }
        return k;
    }
}
