public class BeautifulArrangements {
    int count = 0;

    public int countArrangement(int n) {
        if (n == 0)
            return 0;
        helper(n, 1, new int[n + 1]);
        return count;
    }

    private void helper(int n, int pos, int[] used) {
        if (pos > n) {
            count++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                used[i] = 1;
                helper(n, pos + 1, used);
                used[i] = 0;
            }
        }
    }

}
