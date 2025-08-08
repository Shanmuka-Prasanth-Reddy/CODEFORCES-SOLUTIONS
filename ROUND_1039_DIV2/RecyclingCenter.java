import java.util.*;

public class RecyclingCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            int i = 0, res = n;
            long x = 1;
            
            while (i < n && a[i] <= c) i++;
            i--;
            
            while (i >= 0) {
                if (a[i] * x <= c) {
                    res--;
                    x *= 2;
                    i--;
                    while (i >= 0 && a[i] * x > c) i--;
                } else {
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
