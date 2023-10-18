import java.util.Arrays;

public class ReducingDishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int totalSatisfaction = 0;
        int maxTotalSatisfaction = 0;
        int numDishes = satisfaction.length;

        for (int i = numDishes - 1; i >= 0 && satisfaction[i] > -totalSatisfaction; --i) {
            totalSatisfaction += satisfaction[i];
            maxTotalSatisfaction += totalSatisfaction;
        }
        return maxTotalSatisfaction;
    }

}
