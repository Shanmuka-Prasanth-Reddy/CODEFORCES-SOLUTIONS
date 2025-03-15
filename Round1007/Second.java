import java.io.*;
import java.util.*;

public class Second {

    static Set<Long> perfectSquares = new HashSet<>();

    static void precomputePerfectSquares() {
        long limit = (long) 1e6;
        for (int i = 1; i * i <= limit; i++) {
            perfectSquares.add((long)i * i);
        }
    }

    public static void main(String[] args) throws IOException {
        precomputePerfectSquares();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if (perfectSquares.contains((long)(n * (n + 1)) / 2)) {
                sb.append("-1\n");
                continue;
            }

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = n-i;
            }

            long sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += a[i];
                if (perfectSquares.contains(sum)) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sum += a[i] - a[i + 1];
                }
            }

            for (int num : a) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
