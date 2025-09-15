import java.util.*;

public class Mexification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            boolean[] seen = new boolean[n + 2];
            for (int x : a) if (x <= n) seen[x] = true;
            int mex = 0;
            while (seen[mex]) mex++;

            long sum;
            if (mex == n) {
                sum = 1L * n * n;
            } else {
                int maxEl = Arrays.stream(a).max().getAsInt();
                if (k == 1) {
                    long s = 0;
                    for (int i = 0; i < n; i++) {
                        if (i == 0) s += Math.max(mex, maxEl);
                        else s += mex;
                    }
                    sum = s;
                } else {
                    sum = 1L * n * Math.max(mex, maxEl);
                }
            }
            System.out.println(sum);
        }
    }
}
