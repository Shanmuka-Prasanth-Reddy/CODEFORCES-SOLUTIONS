import java.util.*;

public class Third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            long[] subSum = new long[n];
            subSum[0] = a[0];
            long max = subSum[0];
            for (int i = 1; i < n; i++) {
                subSum[i] = Math.max(a[i], subSum[i-1] + a[i]);
                max = Math.max(max, subSum[i]);
            }
            if (k % 2 == 0) {
                System.out.println(max);
                continue;
            }
            long[] dp = new long[n];
            dp[n-1] = a[n-1];
            for (int i = n-2; i >= 0; i--) {
                dp[i] = Math.max(a[i], dp[i+1] + a[i]);
            }
            long res = max;
            for (int i = 0; i < n; i++) {
                long sum = (i > 0 && subSum[i-1] > 0) ? subSum[i-1] : 0;
                long rem = (i < n-1 && dp[i+1] > 0) ? dp[i+1] : 0;
                long val = sum + (a[i] + b[i]) + rem;
                res = Math.max(res, val);
            }
            System.out.println(res);
        }
    }
}
