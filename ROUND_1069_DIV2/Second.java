import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        final int K = 1000000007;
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] p = new int[n + 1];
            for (int i = 1; i < l; i++) {
                p[i] = i;
            }
            for (int i = l; i < r; i++) {
                p[i] = K ^ (i - l + 1);
            }
            p[r] = p[l - 1];
            for (int i = r + 1; i <= n; i++) {
                p[i] = i + K;
            }

            int[] a = new int[n];
            for (int i = 1; i <= n; i++) {
                a[i - 1] = p[i] ^ p[i - 1];
            }
            
            for (int x : a) System.out.print(x + " ");
            System.out.println();
        }
    }
}
