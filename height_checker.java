import java.util.*;

public class height_checker {
    public int heightChecker(int[] heights) {
        int c = 0;
        int arr[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i])
                c++;
        }
        return c;

    }

}
