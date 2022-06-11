public class happy_number {
    public boolean isHappy(int n) {
        if (n <= 0)
            return false;

        while (n >= 10) {
            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }

}
