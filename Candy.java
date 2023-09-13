public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i] && candies[i - 1] >= candies[i]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i] && candies[i + 1] >= candies[i]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        int totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += candies[i] + 1;
        }

        return totalCandies;
    }

}
