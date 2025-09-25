import java.util.*;

public class PriceTags {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(),max=0;
            long y = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max=Math.max(a[i],max);
            }
            Map<Integer, Integer> m = new HashMap<>();
            for (int val : a) {
                m.put(val, m.getOrDefault(val, 0) + 1);
            }
            HashSet<Integer> s = new HashSet<>();
            s.add(2);
            for (int val : a) {
                for (int d = 1; d * d <= val; d++) {
                    s.add(d);
                    s.add((val + d - 1) / d);
                }
            }
            long best = Long.MIN_VALUE;
            for (int x : s) {
                if (x <= 1 || x > max + 1) continue;

                Map<Integer, Integer> mp = new HashMap<>();
                long sumNew = 0;
                for (int val : a) {
                    int newPrice = (val + x - 1) / x;
                    sumNew += newPrice;
                    mp.put(newPrice, mp.getOrDefault(newPrice, 0) + 1);
                }

                long reused = 0;
                for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                    int price = entry.getKey();
                    int cnt = entry.getValue();
                    if (m.containsKey(price)) {
                        reused += Math.min(cnt, m.get(price));
                    }
                }
                long printed = n - reused;
                long income = sumNew - printed * y;
                best = Math.max(best, income);
            }

            System.out.println(best);
        }
    }
}
