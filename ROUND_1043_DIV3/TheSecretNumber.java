import java.util.*;

public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            List<Long> li = new ArrayList<>();

            for (int k = 1; k <= 18; k++) {
                long d = (long) Math.pow(10, k) + 1;
                if (d > n) break;
                if (n % d == 0) {
                    long x = n / d;
                    li.add(x);
                }
            }

            if (li.isEmpty()) {
                System.out.println(0);
            } else {
                Collections.sort(li);
                System.out.println(li.size());
                for (long x : li) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
