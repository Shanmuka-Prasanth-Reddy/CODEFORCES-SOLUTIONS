import java.util.*;

public class HiddenKnowledgeoftheAncients {
    static long count(int K, int[] a, int L, int R) {
        if (K < 0) return 0;
        int n = a.length;
        Map<Integer, Integer> m = new HashMap<>();
        long res = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            m.put(a[right], m.getOrDefault(a[right], 0) + 1);

            while (m.size() > K) {
                m.put(a[left], m.get(a[left]) - 1);
                if (m.get(a[left]) == 0) m.remove(a[left]);
                left++;
            }

            int windowLen = right - left + 1;
            if (windowLen >= L) {
                int valid = Math.min(windowLen, R) - L + 1;
                if (valid > 0) res += valid;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            long ans = count(k, a, l, r) - count(k - 1, a, l, r);
            System.out.println(ans);
        }
    }
}
