public class RemoveStonesToMinimiseTheTotal {
    public int minStoneSum(int[] piles, int k) {
        int size = piles.length;
        while (k > 0) {
            Arrays.sort(piles);
            for (int i = size - 1; i >= size / 2; i--) {
                int floorVal = (int) Math.floor(piles[i] / 2);
                piles[i] -= floorVal;
                k--;
                if (k == 0)
                    break;
            }
        }
        int ans = 0;
        for (int i = 0; i < size; i++)
            ans += piles[i];
        return ans;
    }
}
