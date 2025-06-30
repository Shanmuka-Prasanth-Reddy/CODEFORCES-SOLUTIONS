import java.util.*;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            System.out.println(solve(a));
        }
        
        sc.close();
    }
    
    private static int solve(int[] a) {
        int n = a.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i+1]) <= 1) {
                return 0;
            }
        }
        
        if (n == 2) {
            return -1;
        }
        
        for (int i = 0; i < n - 1; i++) {
            int mn = Math.min(a[i], a[i+1]);
            int mx = Math.max(a[i], a[i+1]);
            
            if (i > 0 && Math.max(a[i-1], mn) <= Math.min(a[i-1], mx)) {
                return 1;
            }
            
            if (i < n - 2 && Math.max(a[i+2]-1, mn) <= Math.min(a[i+2]+1, mx)) {
                return 1;
            }
        }
        
        return 1;
    }
}