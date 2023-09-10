public class CountAllValidPickupAndDeliveryOptions {
    public int countOrders(int n) {
        long res = 1, mod = 1000000007;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0)
                res = res * i / 2 % mod;
            else
                res = res * i % mod;
        }
        return (int) res;
    }

}
