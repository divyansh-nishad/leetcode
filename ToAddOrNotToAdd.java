import java.util.Scanner;
public class ToAddOrNotToAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        int ans = 0;
        while (j < n) {
            if (arr[j] == 0) {
                k--;
            }
            if (k < 0) {
                if (arr[i] == 0) {
                    k++;
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
    }
    
}
