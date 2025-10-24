import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            //System.out.println("----------------------------------------");
            int n = sc.nextInt();
            int[] a = new int[n];
            long[] b = new long[n];
            int[] c = new int[200001];
            boolean ans = false;
            HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                m.putIfAbsent(a[i], new ArrayList<>());
                int x = a[i];
                for (int j = 2; j * j <= x; j++) {
                    if (x % j == 0) {
                        m.get(a[i]).add(j);
                        c[j]++;
                        while (x % j == 0) x /= j;
                        if (c[j] >= 2) ans = true;
                    }
                }
                if (x > 1) {
                    m.get(a[i]).add(x);
                    c[x]++;
                    if (c[x] >= 2) ans = true;
                }
            }
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();
            if (ans) {
                System.out.println(0);
                continue;
            }
            long min = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j : m.get(a[i])) c[j]--;
                int x = a[i] + 1;
                boolean ok = false;
                for (int j = 2; j * j <= x; j++) {
                    if (x % j == 0) {
                        if (c[j] > 0) ok = true;
                        while (x % j == 0) x /= j;
                    }
                }
                if (x > 1 && c[x] > 0) ok = true;
                if (ok) min = Math.min(min, b[i]);
                for (int j : m.get(a[i])) c[j]++;
            }
            if (min != Long.MAX_VALUE) {
                System.out.println(min);
            } else {
                Arrays.sort(b);
                System.out.println((long) b[0] + b[1]);
            }
        }
    }
}
