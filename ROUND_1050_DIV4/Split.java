import java.util.*;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Map<Integer,Integer> total = new HashMap<>();
            for (int x : a) total.put(x, total.getOrDefault(x,0)+1);

            Map<Integer,Integer> limit = new HashMap<>();
            boolean possible = true;
            for (int x : total.keySet()) {
                if (total.get(x) % k != 0) {
                    possible = false;
                    break;
                }
                limit.put(x, total.get(x)/k);
            }

            if (!possible) {
                System.out.println(0);
                continue;
            }

            long ans = 0;
            Map<Integer,Integer> freq = new HashMap<>();
            int l = 0;
            for (int r = 0; r < n; r++) {
                freq.put(a[r], freq.getOrDefault(a[r],0)+1);

                while (freq.get(a[r]) > limit.get(a[r])) {
                    freq.put(a[l], freq.get(a[l])-1);
                    l++;
                }
                ans += (r - l + 1);
            }
            System.out.println(ans);
        }
    }
}
