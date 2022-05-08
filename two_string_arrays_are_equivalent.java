public class two_string_arrays_are_equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int l1 = word1.length;
        int l2 = word2.length;
        String k1 = "", k2 = "";
        for (int i = 0; i < l1; i++) {
            k1 = k1 + word1[i];
        }
        for (int i = 0; i < l2; i++) {
            k2 = k2 + word2[i];
        }
        if (k1.equals(k2))
            return true;
        else
            return false;

    }
}
