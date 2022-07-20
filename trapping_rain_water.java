public class trapping_rain_water {
    public int trap(int[] height) {
        int l[] = new int[height.length];
        int r[] = new int[height.length];
        l[0] = height[0];
        for (int i = 1; i < height.length; i++)
            l[i] = Math.max(l[i - 1], height[i]);
        r[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--)
            r[i] = Math.max(r[i + 1], height[i]);
        int wat = 0;
        for (int i = 0; i < height.length; i++)
            wat += Math.min(l[i], r[i]) - height[i];
        return wat;
    }

}
