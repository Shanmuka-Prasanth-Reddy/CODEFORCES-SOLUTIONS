import java.util.*;

public class AandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Integer> posA = new ArrayList<>();
            ArrayList<Integer> posB = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') posA.add(i);
                else posB.add(i);
            }
            long movesA = moves(posA);
            long movesB = moves(posB);
            System.out.println(Math.min(movesA, movesB));
        }
    }
    static long moves(ArrayList<Integer> pos) {
        if (pos.size()==0) return Long.MAX_VALUE;
        int m = pos.size();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = pos.get(i) - i;
        }
        Arrays.sort(a);
        
        int half = a[m / 2];
        long res = 0;
        for (int x : a) {
            res += Math.abs(x - half);
        }
        return res;
    }
}
