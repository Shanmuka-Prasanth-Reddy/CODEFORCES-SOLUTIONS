import java.util.*;

public class Third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            long cur_s = -v[n - 1];
            long best_diff = -v[n - 1];
            long ans = 0;

            for (int i = n - 2; i >= 0; i--) {
                long val = v[i];
                long opt = -cur_s + Math.max(0L, val + best_diff);

                cur_s -= val;
                best_diff = Math.max(best_diff, opt - cur_s);

                if (i == 0) ans = opt;
            }
            System.out.println(ans);
        }
    }
}