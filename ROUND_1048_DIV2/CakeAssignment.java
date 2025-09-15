import java.util.*;

public class CakeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();
            long c = 1L << k;

            if (x == c) {
                System.out.println(0);
                System.out.println();
                continue;
            }
            ArrayList<Integer> l = new ArrayList<>();
            long cur = x;
            while (cur != c) {
                if (cur > c) {
                    cur = 2 * (cur - c);
                    l.add(2);
                } else {
                    cur = 2 * cur;
                    l.add(1);
                }
            }

            Collections.reverse(l);
            System.out.println(l.size());
            for (int i = 0; i < l.size(); i++) {
                System.out.print(l.get(i));
                if (i < l.size() - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
