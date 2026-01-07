import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k == 1) {
                System.out.println(n);
                continue;
            }
            if (k%2!=0) {
                for (int i = 0; i < k; i++) {
                    System.out.print(n + " ");
                }
                System.out.println();
                continue;
            }
            int a, b;
            int first = Integer.highestOneBit(n);
            int second = Integer.highestOneBit(n ^ first);
            if (second == 0) {
                a = first;
                b = n ^ first;
            } else {
                a = (second << 1) - 1;
                b = n ^ a;
            }
            for (int i = 0; i < k - 2; i++) {
                System.out.print(n + " ");
            }
            System.out.println(a + " " + b);
        }
    }
}
