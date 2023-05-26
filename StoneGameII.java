public class StoneGameII {
    public int stoneGameII(int[] piles) {
        if (piles == null || piles.length == 0)
            return 0;

        int[][] cache = new int[piles.length][piles.length];

        int[] suffixSum = new int[piles.length];
        suffixSum[suffixSum.length - 1] = piles[piles.length - 1];
        for (int i = piles.length - 2; i >= 0; --i)
            suffixSum[i] = piles[i] + suffixSum[i + 1];

        return helper(piles, suffixSum, cache, 0, 1);
    }

    private int helper(int[] piles, int[] suffixSum, int[][] cache, int firstPile, int M) {
        if (firstPile == piles.length)
            return 0; // no more piles left
        if (piles.length - firstPile <= 2 * M)
            return suffixSum[firstPile];
        if (cache[firstPile][M] != 0)
            return cache[firstPile][M];

        int result = 0;
        for (int x = 1; x <= 2 * M; ++x) {
            result = Math.max(result,
                    suffixSum[firstPile] - helper(piles, suffixSum, cache, firstPile + x, Math.max(M, x)));
        }

        cache[firstPile][M] = result;
        return result;
    }
}
