import java.util.*;

public class AgainstTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            HashMap<Integer, List<Integer>> occ = new HashMap<>();
            HashMap<Integer, Integer> pos = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                occ.computeIfAbsent(a[i], k -> new ArrayList<>()).add(i);
            }
            for (Map.Entry<Integer, List<Integer>> e : occ.entrySet()) {
                List<Integer> list = e.getValue();
                for (int j = 0; j < list.size(); j++) {
                    pos.put(list.get(j), j);
                }
            }

            int[] dp = new int[n];
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int key : occ.keySet()) freq.put(key, occ.get(key).size());

            dp[n - 1] = a[n - 1] == 1 ? 1 : 0;

            for (int i = n - 2; i >= 0; i--) {
                int idx = pos.get(i);               
                int s = freq.get(a[i]);
                if (s - idx - 1 >= a[i] - 1) {
                    int nxt = occ.get(a[i]).get(idx + a[i] - 1) + 1;
                    dp[i] = Math.max(dp[i + 1], a[i] + (nxt < n ? dp[nxt] : 0));
                } else {
                    dp[i] = dp[i + 1];
                }
            }

            System.out.println(dp[0]);
        }
    }
}
