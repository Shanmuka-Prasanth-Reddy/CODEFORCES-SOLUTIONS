import java.util.*;

public class PermutationModCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                min = Math.min(min, a[i]);
            }

            // Compute GCD of the array
            long g = a[0];
            for (int i = 1; i < n; i++) {
                g = gcd(g, a[i]);
            }

            System.out.println(g == min ? "YES" : "NO");
        }

        sc.close();
    }

    // Euclidean algorithm for GCD of two long values
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
