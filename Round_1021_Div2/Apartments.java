import java.util.*;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int k = scanner.nextInt(); 
            long[] a = new long[n]; 

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            Arrays.sort(a);
            TreeSet<Long> possibleHouses = new TreeSet<>();

            for (int i = 0; i <= k; i++) {
                int size = n - k;
                int medianIndex = (size - 1) / 2;

                if (size % 2 == 1) {
                    possibleHouses.add(a[i + medianIndex]);
                } else {
                    long leftMedian = a[i + medianIndex];
                    long rightMedian = a[i + medianIndex + 1];
                    for (long x = leftMedian; x <= rightMedian; x++) {
                        possibleHouses.add(x);
                    }
                }
            }
            System.out.println(possibleHouses.size());
        }

        scanner.close();
    }
}