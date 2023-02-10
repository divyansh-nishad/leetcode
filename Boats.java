import java.util.*;
public class Boats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }
        Arrays.sort(people);
        int i = 0, j = n - 1;
        int ans = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            ans++;
        }
        System.out.println(ans);

    }
    
}
