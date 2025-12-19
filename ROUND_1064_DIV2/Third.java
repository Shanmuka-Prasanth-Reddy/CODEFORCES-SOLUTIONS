import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            boolean avail[] = new boolean[n];
            Arrays.fill(avail, true);
            HashMap<Integer, int[]> m = new HashMap<>();
            PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) ->
                Integer.compare(
                    Math.max(a[x[0]], a[x[2]]),
                    Math.max(a[y[0]], a[y[2]])
                )
            );
            for (int i = 0; i < n; i++) {
                int arr[] = new int[]{i, (i - 1 + n) % n, (i + 1) % n};
                m.put(i, arr);
                pq.add(arr);
            }
            long res = 0;
            int cnt = n;
            while (cnt > 1) {
                int arr[] = pq.poll();
                int cur = arr[0];
                int left = arr[1];
                int right = arr[2];
                if (!avail[cur] || !avail[right]) continue;
                int cost = Math.max(a[cur], a[right]);
                res += cost;
                a[cur] = cost;
                avail[right] = false;
                cnt--;
                int rgt = m.get(right)[2];
                arr[2] = rgt;
                m.put(cur, arr);
                int next[] = m.get(rgt);
                next[1] = cur;
                m.put(rgt, next);
                int lft[] = m.get(left);
                lft[2] = cur;
                m.put(left, lft);
                pq.add(arr);
                pq.add(next);
                pq.add(lft);
            }
            System.out.println(res);
        }
    }
}
