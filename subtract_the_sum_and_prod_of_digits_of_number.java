public class subtract_the_sum_and_prod_of_digits_of_number {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        int c = n;
        while (c != 0) {
            int d = c % 10;
            prod = prod * d;
            sum = sum + d;
            c = c / 10;
        }
        return prod - sum;
    }

}
