import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long initialSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if ((i + 1) % 2 != 0) {
                    initialSum += a[i];
                } else {
                    initialSum -= a[i];
                }
            }

            long maxGain = 0;

            // First pass: left to right, considering swaps where odd index i < even index j
            long minOddPlus = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if ((i + 1) % 2 != 0) { // Odd index
                    minOddPlus = Math.min(minOddPlus, 2 * a[i] + (i + 1));
                } else { // Even index
                    if (minOddPlus != Long.MAX_VALUE) {
                        maxGain = Math.max(maxGain, (2 * a[i] + (i + 1)) - minOddPlus);
                    }
                }
            }

            // Second pass: right to left, considering swaps where odd index i > even index j
            long maxOddMinus = Long.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                if ((i + 1) % 2 != 0) { // Odd index
                    maxOddMinus = Math.max(maxOddMinus, 2 * a[i] - (i + 1));
                } else { // Even index
                    if (maxOddMinus != Long.MIN_VALUE) {
                        maxGain = Math.max(maxGain, maxOddMinus - (2 * a[i] - (i + 1)));
                    }
                }
            }
            System.out.println(initialSum + maxGain);
        }
        scanner.close();
    }
}