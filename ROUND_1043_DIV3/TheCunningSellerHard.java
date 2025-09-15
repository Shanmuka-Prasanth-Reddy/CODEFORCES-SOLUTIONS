import java.util.*;

public class TheCunningSellerHard {
    static long cost(int x) {
        return (long)Math.pow(3, x+1) + (long)x * (long)Math.pow(3, x-1);
    }
    static long size(int x) {
        return (long)Math.pow(3, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(); // target quantity
            long m = sc.nextLong(); // max operations

            long ans = Long.MAX_VALUE;

            // try all ways of filling n watermelons in <= m deals
            dfs(n, m, 20, 0, ansHolder);  

            System.out.println(ansHolder[0] == Long.MAX_VALUE ? -1 : ansHolder[0]);
        }
    }

    static void dfs(long n, long m, int maxX, long curCost, long[] ansHolder) {
        if (n == 0) {
            ansHolder[0] = Math.min(ansHolder[0], curCost);
            return;
        }
        if (m == 0 || maxX < 0) return;

        // option 1: skip current deal size
        dfs(n, m, maxX-1, curCost, ansHolder);

        // option 2: use some deals of size(maxX)
        long dealSize = size(maxX);
        long dealCost = cost(maxX);

        long maxCount = Math.min(n/dealSize, m);
        for (int cnt=1; cnt<=maxCount; cnt++) {
            dfs(n - cnt*dealSize, m - cnt, maxX-1, curCost + cnt*dealCost, ansHolder);
        }
    }

    static long[] ansHolder = new long[1];
}
