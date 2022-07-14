public class count_the_number_of_consistent_strings {
    public int countConsistentStrings(String allowed, String[] words) {
        int alp = 0;
        int count = 0;
        for (int i = 0; i < allowed.length(); i++) {
            alp = (alp | (1 << allowed.charAt(i) - 'a'));
        }
        outer: for (String w : words) {
            for (int i = 0; i < w.length(); ++i) {
                if ((alp & (1 << w.charAt(i) - 'a')) == 0) {
                    continue outer;
                }
            }
            ++count;
        }
        return count;
    }

}
