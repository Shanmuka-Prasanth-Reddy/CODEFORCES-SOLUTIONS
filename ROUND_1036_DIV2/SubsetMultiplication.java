import java.util.*;

public class SubsetMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int g = b[0];
            for (int i = 1; i < n; i++) {
                g = gcd(g, b[i]);
            }
            int x = 1;
            for (int i = 0; i < n; i++) {
                if (b[i] != g) {
                    x = b[i] / g;
                    break;
                }
            }
            if (x == 1) x = 1;
            System.out.println(x);
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
