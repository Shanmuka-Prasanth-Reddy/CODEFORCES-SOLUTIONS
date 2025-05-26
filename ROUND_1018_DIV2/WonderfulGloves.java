import java.util.*;

public class WonderfulGloves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] left = new int[n];
            int[] right = new int[n];

            for (int i = 0; i < n; i++) {
                left[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                right[i] = sc.nextInt();
            }

            List<Integer> pairs = new ArrayList<>();
            int extraLeft = 0;
            int extraRight = 0;

            for (int i = 0; i < n; i++) {
                int p = Math.min(left[i], right[i]);
                pairs.add(p);
                extraLeft += left[i] - p;
                extraRight += right[i] - p;
            }
            Collections.sort(pairs, Collections.reverseOrder());

            int guaranteedPairs = 0;
            for (int i = 0; i < k; i++) {
                guaranteedPairs += pairs.get(i);
            }

            int x = 2 * k; 
            int count = 0;

            for (int i = k; i < pairs.size(); i++) {
                if (extraLeft > 0) {
                    x++;
                    extraLeft--;
                } else if (extraRight > 0) {
                    x++;
                    extraRight--;
                } else {
                    break;
                }
            }

            System.out.println(x+guaranteedPairs);
        }
    }
}
