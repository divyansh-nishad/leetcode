public class WordBreak {
    String s;
    List<String> wordDict;
    int[] memo;

    public boolean wordBreak(String s, List<String> wordDict) {
        this.s = s;
        this.wordDict = wordDict;

        memo = new int[s.length()];
        Arrays.fill(memo, -1);

        return dp(0);
    }

    public boolean dp(int index) {
        if (index == s.length()) {
            return true;
        }

        if (memo[index] != -1) {
            return memo[index] == 1 ? true : false;
        }

        boolean res = false;
        for (String word : wordDict) {
            if (index + word.length() <= s.length()) {
                String sub = s.substring(index, index + word.length());
                if (sub.equals(word)) {
                    if (dp(index + sub.length())) {
                        res = true;
                    }
                }
            }
        }

        if (res == true) {
            memo[index] = 1;
        } else {
            memo[index] = 0;
        }
        return res;

    }

}
