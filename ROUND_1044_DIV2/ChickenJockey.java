import java.util.*;

public class ChickenJockey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long[] dp = new long[n];
            dp[0] = a[0];

            for (int i = 1; i < n; i++) {
                long noFall = dp[i - 1] + a[i]-1;
                long fall = Math.max(a[i]-i,0)+a[i-1]+(i-2>=0?dp[i-2]:0);
                dp[i]=Math.min(noFall,fall);
            }

            System.out.println(dp[n - 1]);
        }
    }
}
