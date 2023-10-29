public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        Integer[][] memo = new Integer[buckets + 1][minutesToTest + 1];
        return findMinPigs(buckets, minutesToDie, minutesToTest, memo);
    }

    private int findMinPigs(int buckets, int minutesToDie, int minutesToTest, Integer[][] memo) {
        if (buckets == 0)
            return 0;
        if (minutesToTest < minutesToDie)
            return 0;
        if (buckets == 1)
            return 0;

        if (memo[buckets][minutesToTest] != null)
            return memo[buckets][minutesToTest];

        int numPigs = 1;
        while (Math.pow((minutesToTest / minutesToDie + 1), numPigs) < buckets) {
            numPigs++;
        }

        memo[buckets][minutesToTest] = numPigs;
        return numPigs;
    }

}
