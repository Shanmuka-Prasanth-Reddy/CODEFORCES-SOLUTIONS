import java.util.*;

public class Duel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            boolean hasLiar = false;
            // Check for consecutive zeros
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == 0 && a[i + 1] == 0) {
                    hasLiar = true;
                    break;
                }
            }
            // Check if all report 1
            if (sum == n) {
                hasLiar = true;
            }
            System.out.println(hasLiar ? "YES" : "NO");
        }
        sc.close();
    }
}