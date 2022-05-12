public class replace_all_digits_with_character {
    public String replaceDigits(String s) {
        int l = s.length();
        String k = "";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (i % 2 == 1) {
                char n = s.charAt(i - 1);
                int v = (int) n;
                int m = Character.getNumericValue(s.charAt(i));
                v = v + m;
                if (v > 122)
                    v = v - 26;
                n = (char) v;
                k = k + n;
            } else
                k = k + ch;
        }
        return k;

    }
}
