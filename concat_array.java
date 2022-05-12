import java.util.Scanner;

public class concat_array {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int l2 = 2 * l;
        int arr[] = new int[l2];
        for (int i = 0; i < l; i++)
            arr[i] = nums[i];
        for (int i = 0; i < l; i++)
            arr[i + l] = nums[i];
        return arr;

    }
}
