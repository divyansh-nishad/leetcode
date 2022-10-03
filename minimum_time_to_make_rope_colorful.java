public class Minimum_time_to_make_rope_colorful {
    public int minCost(String colors, int[] neededTime) {
        int l = colors.length();
        int min = 0;
        for (int i = 0; i < l - 1; i++) {
            char a = colors.charAt(i);
            char b = colors.charAt(i + 1);
            if (a == b) {
                min = min + (int) Math.min(neededTime[i], neededTime[i + 1]);
                neededTime[i + 1] = Math.max(neededTime[i], neededTime[i + 1]);
            }
        }
        return min;
    }

}
