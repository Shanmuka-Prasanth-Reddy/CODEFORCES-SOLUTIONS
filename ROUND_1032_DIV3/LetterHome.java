import java.util.*;

public class LetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(Math.min(
                Math.abs(a[n-1]-s)+(a[n-1]-a[0])
                ,Math.abs(s-a[0])+(a[n-1]-a[0])));
        }
    }
}
