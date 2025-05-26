import java.util.*;

public class BinaryTypeWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int transitions = 0;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    transitions++;
                }
            }

            int moves = transitions + (s.charAt(0) == '1' ? 1 : 0);

            int reducible = Math.min(2, transitions);
            int minMoves = moves - reducible;

            int totalCost = n + minMoves;
            System.out.println(totalCost);
        }
    }
}
