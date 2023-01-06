public class MaximumIcecreamBars {
    public int maxIceCream(int[] A, int coins) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; ++i)
            if ((coins -= A[i]) < 0)
                return i;
        return A.length;
    }
    
}
