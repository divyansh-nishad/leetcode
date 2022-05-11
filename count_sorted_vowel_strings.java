public class count_sorted_vowel_strings {
    public int countVowelStrings(int n) {
        int val = (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
        return val;

    }
}
