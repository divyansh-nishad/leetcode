public class SuccesfulPairsOfSellsAndPotions {
    public int valid_pos(int[] potions, long success, int spell) {
        long potion_needed = (success + spell - 1) / spell;
        int l = 0, r = potions.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (potions[mid] >= potion_needed)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            res[i] = potions.length - valid_pos(potions, success, spells[i]);
        }
        return res;
    }
}
