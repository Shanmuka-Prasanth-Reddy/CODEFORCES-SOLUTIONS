import java.util.Scanner;

public class CountGoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] primes = {2, 3, 5, 7};

        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long right = count(r, primes);
            long left = count(l - 1, primes);
            System.out.println(right - left);
        }
    }

    public static long count(long n, long[] p) {
        long bad = 0;
        for (int i = 0; i < p.length; i++) {
            long val = p[i];
            if (val <= n) bad += n / val;
        }
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                long val = lcm(p[i], p[j]);
                if (val <= n) bad -= n / val;
            }
        }
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                for (int k = j + 1; k < p.length; k++) {
                    long val = lcm(lcm(p[i], p[j]), p[k]);
                    if (val <= n) bad += n / val;
                }
            }
        }
        long val = lcm(lcm(p[0], p[1]), lcm(p[2], p[3]));
        if (val <= n) bad -= n / val;
        return n - bad;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
