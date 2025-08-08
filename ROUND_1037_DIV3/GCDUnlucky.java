import java.util.*;

 public class GCDUnlucky{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] p = new long[n];
            long[] s = new long[n];
            
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
            }
            
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }
            
            boolean valid = true;
            
           
            for (int i = 1; i < n && valid; i++) {
                if (p[i] > p[i-1]) valid = false;
            }
             
            for (int i = 0; i < n-1 && valid; i++) {
                if (s[i] > s[i+1]) valid = false;  
            }
            
            if (!valid) {
                System.out.println("NO");
                continue;
            }
            
         
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = lcm(p[i], s[i]);
            }
         
            long prefixGcd = a[0];
            if (prefixGcd != p[0]) {
                valid = false;
            }
            
            for (int i = 1; i < n && valid; i++) {
                prefixGcd = gcd(prefixGcd, a[i]);
                if (prefixGcd != p[i]) {
                    valid = false;
                }
            }
             
            if (valid) {
                long suffixGcd = a[n-1];
                if (suffixGcd != s[n-1]) {
                    valid = false;
                }
                
                for (int i = n-2; i >= 0 && valid; i--) {
                    suffixGcd = gcd(suffixGcd, a[i]);
                    if (suffixGcd != s[i]) {
                        valid = false;
                    }
                }
            }
            
            System.out.println(valid ? "YES" : "NO");
        }
    }
    
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
