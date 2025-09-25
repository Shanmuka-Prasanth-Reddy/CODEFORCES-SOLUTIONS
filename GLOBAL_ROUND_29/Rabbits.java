import java.util.*;

public class Rabbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            List<Integer> zeroIndices = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeroIndices.add(i);
                }
            }
            if (zeroIndices.isEmpty()) {
                System.out.println("YES");
                continue;
            }
            boolean hasAdjacentZeros = false;
            for (int i = 0; i < zeroIndices.size() - 1; i++) {
                if (zeroIndices.get(i + 1) - zeroIndices.get(i) == 1) {
                    hasAdjacentZeros = true;
                    break;
                }
            }
            if (hasAdjacentZeros) {
                System.out.println("YES");
            } else {
                boolean allEvenOnes = true;
                for (int i = 0; i < zeroIndices.size() - 1; i++) {
                    int numOnes = zeroIndices.get(i + 1) - zeroIndices.get(i) - 1;
                    if (numOnes % 2 != 0) {
                        allEvenOnes = false;
                        break;
                    }
                }
                if (allEvenOnes) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}