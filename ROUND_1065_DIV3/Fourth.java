import java.util.*;
public class Fourth {
    static class DSU {
        int[] par;
        int cnt;
        public DSU(int n) {
            par = new int[n];
            cnt = n;
            for (int i = 0; i < n; i++) {
                par[i] = i;
            }
        }
        public int find(int i) {
            if (par[i] == i)
                return i;
            return par[i] = find(par[i]);
        }
        public void union(int i, int j) {
            int u = find(i);
            int v = find(j);
            if (u != v) {
                par[u] = v; 
                cnt--;
            }
        }

        public int getcnt() {
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) 
                p[i] = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int cnt = 0;

            for (int x : p) {
                NavigableMap<Integer, Integer> smaller = map.headMap(x, false);
                if (smaller.isEmpty()) {
                    map.put(x, x);
                    cnt++;
                } else {
                    Set<Integer> keysToMerge = new HashSet<>(smaller.keySet());
                    int newMin = keysToMerge.stream().min(Integer::compare).get();
                    for (Integer minKey : keysToMerge) {
                        map.remove(minKey);
                        cnt--;
                    }
                    map.put(newMin, x);
                    cnt++;
                }
            }
            System.out.println(map.size() == 1 ? "Yes" : "No");
        }
        sc.close();
    }
}