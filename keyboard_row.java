import java.util.*;

public class keyboard_row {
    public boolean check(String str) {
        str = str.toLowerCase();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        boolean flg1 = false;
        boolean flg2 = false;
        boolean flg3 = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (r1.indexOf(ch) != -1) {
                flg1 = true;
            } else if (r2.indexOf(ch) != -1)
                flg2 = true;
            else
                flg3 = true;
        }
        int c = 0;

        if (flg1)
            c++;
        if (flg2)
            c++;
        if (flg3)
            c++;
        if (c == 1)
            return true;
        else
            return false;

    }

    public String[] findWords(String[] words) {
        List<String> li = new ArrayList<String>();
        int l = words.length;
        for (int i = 0; i < l; i++) {
            if (check(words[i]))
                li.add(words[i]);
        }
        return li.toArray(new String[0]);

    }

}
