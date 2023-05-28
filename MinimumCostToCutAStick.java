public class MinimumCostToCutAStick {
    public int minCost(int n, int[] cuts) {

        Arrays.sort(cuts);
        return helper(cuts, new HashMap<>(), 0, n);
    }

    private int helper(int[] cuts, Map<String, Integer> memo, int l, int r) {

        int res = Integer.MAX_VALUE;

        String key = l + "-" + r;
        if (memo.containsKey(key))
            return memo.get(key);

        for (int i = 0; i < cuts.length; ++i) {
            if (cuts[i] <= l || cuts[i] >= r)
                continue;

            int cost = r - l;
            res = Math.min(

                    helper(cuts, memo, l, cuts[i]) + cost + helper(cuts, memo, cuts[i], r),
                    res);
        }

        res = res == Integer.MAX_VALUE ? 0 : res;
        memo.put(key, res);

        return res;
    }

}
