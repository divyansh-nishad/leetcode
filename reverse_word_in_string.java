public class reverse_word_in_string {
    public String reverseWords(String s) {
        s = s + " ";
        int l = s.length();
        String ret = "";
        String k = "";
        for (int i = 0; i < l; i++) {

            char ch = s.charAt(i);
            if (ch != ' ')
                k = ch + k;
            else {
                ret = ret + k + " ";
                k = "";
            }
        }
        return ret.trim();
    }
}
