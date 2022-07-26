public class count_triplets_that_can_form_two_arrays_of_equal_length {
    public int countTriplets(int[] arr) {
        int c = 0;
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < n - 1; i++) {
            xor = arr[i];
            for (int j = i + 1; j < n; j++) {
                xor ^= arr[j];
                if (xor == 0)
                    c += j - i;
            }
        }
        return c;
    }

}
