public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String S) {
        if (S == null || S.length() <= 1)
            return 0;
        int n = S.length();
        int cntEndWithOne = 0, cntEndWithZero = 0;

        for (int i = 0; i < n; i++) {
            char c = S.charAt(i);
            cntEndWithOne = Math.min(cntEndWithZero, cntEndWithOne) + (c == '1' ? 0 : 1);
            cntEndWithZero += (c == '0' ? 0 : 1);
        }
        return Math.min(cntEndWithOne, cntEndWithZero);
    }

}
