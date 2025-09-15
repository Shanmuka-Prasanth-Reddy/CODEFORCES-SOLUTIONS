import java.util.*;

public class VadimDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            System.out.println(solve(k));
        }
    }

    static long solve(long k) {
        long sum = 0;
        int d = 1;
        while (true) {
            long cnt = 9L * pow10(d - 1);     // count of d-digit numbers
            long digits = cnt * d;            // total digits in this block
            if (k > digits) {
                // Take whole block
                sum += blockDigitSum(d, cnt);
                k -= digits;
                d++;
            } else {
                // Cut happens inside this block
                long start = pow10(d - 1);
                long numIndex = (k - 1) / d;  // how many full numbers fit
                long pos = (k - 1) % d;       // position inside current number
                for (long i = 0; i < numIndex; i++) {
                    sum += digitSum(start + i);
                }
                // last number partial
                String s = Long.toString(start + numIndex);
                for (int i = 0; i <= pos; i++) {
                    sum += s.charAt(i) - '0';
                }
                break;
            }
        }
        return sum;
    }

    static long pow10(int e) {
        long res = 1;
        while (e-- > 0) res *= 10;
        return res;
    }

    static long digitSum(long x) {
        long s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    static long blockDigitSum(int d, long cnt) {
        // numbers from 10^(d-1) to 10^d - 1
        long sum = 0;
        long lo = pow10(d - 1);
        long hi = lo + cnt - 1;
        for (long i = lo; i <= hi; i++) {
            sum += digitSum(i);
        }
        return sum;
    }
}
