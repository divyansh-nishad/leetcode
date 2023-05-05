public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int c = 0;
        String vow = "aeiou";
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (vow.indexOf(ch) != -1) {
                c++;
            }
        }
        int maxCount = c;
        for (int i = k; i < s.length(); i++) {
            char removeChar = s.charAt(i - k);
            char addChar = s.charAt(i);
            if (vow.indexOf(removeChar) != -1) {
                c--;
            }
            if (vow.indexOf(addChar) != -1) {
                c++;
            }
            maxCount = Math.max(maxCount, c);
        }
        return maxCount;
    }

}
