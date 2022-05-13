public class truncate_sentence {
    public String truncateSentence(String s, int k) {
        s = s.trim();
        s = s + " ";
        int l = s.length();
        int c = 0;
        String j = "";
        String w = "";
        for (int i = 0; i < l && c < k; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                w = w + j + " ";
                j = "";
                c++;
            } else
                j = j + ch;

        }
        return w.trim();
    }
}
