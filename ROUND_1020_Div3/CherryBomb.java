import java.util.*;

public class CherryBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Integer x = null;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                if (b[i] != -1) {
                    int sum = a[i] + b[i];
                    if (x == null) {
                        x = sum;
                    } else if (x != sum) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid) {
                System.out.println("0");
                continue;
            }

            if (x == null) {
                int maxLower = a[0];
                int minUpper = a[0] + k;
                for (int i = 1; i < n; i++) {
                    maxLower = Math.max(maxLower, a[i]);
                    minUpper = Math.min(minUpper, a[i] + k);
                }
                long count = Math.max(0, minUpper - maxLower + 1);
                System.out.println(count);
            } else {
                long ways = 1;
                for (int i = 0; i < n; i++) {
                    if (b[i] == -1) {
                        int bi = x - a[i];
                        if (bi < 0 || bi > k) {
                            ways = 0;
                            break;
                        }
                    }
                }
                System.out.println(ways);
            }
        }
    }
}