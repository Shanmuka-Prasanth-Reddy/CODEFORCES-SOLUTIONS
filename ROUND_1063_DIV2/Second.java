import java.util.*;
public class Second {
    static void solve(int[] a, char[] x, int start, int end, List<int[]> ops) {
        if (start >= end || ops.size() >= 5) return;
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        int l = -1, r = -1;
        for (int i = start; i <= end; i++) {
            if (a[i] < minVal)
            { 
                minVal = a[i]; l = i; 
            }
            if (a[i] > maxVal){ 
                maxVal = a[i]; r = i; 
            }
        }
        if (x[l] == '1' || x[r] == '1'){
             ops.clear(); 
             ops.add(new int[]{-1, -1}); 
             return; 
        }
        int L = Math.min(l, r), R = Math.max(l, r);
        ops.add(new int[]{L + 1, R + 1});
        solve(a, x, start, L - 1, ops);
        solve(a, x, R + 1, end, ops);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            char[] x = sc.next().toCharArray();
            List<int[]> ops = new ArrayList<>();
            solve(a, x, 0, n - 1, ops);
            if (ops.isEmpty() || ops.get(0)[0] == -1 || ops.size() > 5) System.out.println(-1);
            else {
                System.out.println(ops.size());
                for (int[] op : ops) 
                    System.out.println(op[0] + " " + op[1]);
            }
        }
    }
}
