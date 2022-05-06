public class to_lower_case {
    public String toLowerCase(String s) {
        int l = s.length();
        String k = "";
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                k = k + Character.toLowerCase(ch);
            else
                k = k + ch;
        }
        return k;
    }

}
