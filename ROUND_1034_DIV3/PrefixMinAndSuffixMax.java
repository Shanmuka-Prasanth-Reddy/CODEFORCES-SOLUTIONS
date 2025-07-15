import java.util.*;

public class PrefixMinAndSuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] pre = new int[n];
            int[] suf = new int[n];
            pre[0] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i] = Math.min(pre[i - 1], a[i]);
            }
            suf[n - 1] = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suf[i] = Math.max(suf[i + 1], a[i]);
            }
            char res[]=new char[n];
            Arrays.fill(res,'0');
            for (int i = 1; i < n-1; i++) {
                if(pre[i - 1] >= a[i] || suf[i + 1] <= a[i])
                    res[i]='1';
            }
            res[0]=res[n-1]='1';
            System.out.println(new String(res));
        }
    }
}
