public class check_if_sentence_is_pangram {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        int flg = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1)
                flg = 0;
        }
        if (flg == 1)
            return true;
        else
            return false;
    }
}
