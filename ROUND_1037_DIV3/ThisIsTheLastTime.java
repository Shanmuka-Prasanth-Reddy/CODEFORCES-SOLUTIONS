import java.util.*;

public class ThisIsTheLastTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[][] a = new long[n][3];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextLong();
                a[i][1] = sc.nextLong();
                a[i][2] = sc.nextLong();
            }
            Arrays.sort(a, (x, y) -> Long.compare(x[0], y[0]));
            PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> Long.compare(y[2], x[2]));
            long res = k;
            int idx = 0;
            boolean change;
            do {
                change = false;
                while (idx < n && a[idx][0] <= res) {
                    if (res <= a[idx][1]) {
                        pq.offer(a[idx]);
                    }
                    idx++;
                }
                while (!pq.isEmpty()) {
                    long[] x = pq.peek();
                    if (x[0] <= res && res <= x[1]) {
                        if (x[2] > res) {
                            res = x[2];
                            change = true;
                            pq.poll();
                            break;
                        } else {
                            pq.poll();
                        }
                    } else {
                        pq.poll();
                    }
                }
            } while (change);
            System.out.println(res);
        }
    }
}