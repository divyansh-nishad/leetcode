public class length_of_last_word {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        int l = s.length();
        int count = 0;
        for (int i = l - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;

    }
}
