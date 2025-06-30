import java.util.*;

public class EqualValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long ans = Long.MAX_VALUE;
            int i = 0;

            while (i < n) {
                int j = i;
                while (j + 1 < n && a[j + 1] == a[i]) {
                    j++;
                }
                long v = a[i];
                long cost = v * ((long)i + (long)(n - 1 - j));
                ans = Math.min(ans, cost);
                i = j + 1;
            }

            System.out.println(ans);
        }
    }
}
