public class CountOddNumbersInAIntervalRange {
    public int countOdds(int low, int high) {
        int odd = (high - low) / 2;
        if (low % 2 == 1 || high % 2 == 1) {
            odd++;
        }
        return odd;
    }
    
}
