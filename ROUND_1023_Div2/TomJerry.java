import java.util.*;

public class TomJerry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            long min = Long.MAX_VALUE;
            long max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                min = Math.min(min, a[i]);
                max = Math.max(max, a[i]);
            }
            long M = max - min; // Maximum after normalization
            if (M > k + 1) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
        }
        sc.close();
    }
}