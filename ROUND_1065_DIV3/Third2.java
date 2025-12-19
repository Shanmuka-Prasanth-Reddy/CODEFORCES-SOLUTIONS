import java.util.*;
public class Third2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            String ans = "Tie";
            for (int bit = 20; bit >= 0; bit--) {
                int[] arr = new int[n];
                int[] brr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = (a[i] >> bit) & 1;
                    brr[i] = (b[i] >> bit) & 1;
                }
                int result = solve(arr,brr,n);
                if (result == 1) {
                    ans = "Ajisai";
                    break;
                } else if (result == 2) {
                    ans = "Mai";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    public static int solve(int[] a, int[] b, int n) {
        int aji = 0, ma = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1 && b[i] == 1) {
                aji ^= 1;
                ma ^= 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (a[i] == 1) {
                    if (b[i] == 1) continue;
                    else {
                        if (aji == 0) aji ^= 1;
                        else ma ^= 1;
                    }
                } else if (b[i] == 1) {
                    if (aji == 0) aji ^= 1;
                    else ma ^= 1;
                }
            } else {
                if (a[i] == 1) {
                    if (b[i] == 1) continue;
                    else {
                        if (ma == 0) ma ^= 1;
                        else aji ^= 1;
                    }
                } else if (b[i] == 1) {
                    if (ma == 0) ma ^= 1;
                    else aji ^= 1;
                }
            }
        }
        if (aji == ma) return 0;
        return (aji > ma ? 1 : 2);
    }
}

