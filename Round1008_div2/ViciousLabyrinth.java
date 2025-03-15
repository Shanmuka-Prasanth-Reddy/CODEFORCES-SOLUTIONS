import java.util.*;

public class ViciousLabyrinth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n + 1];  
            for (int i = 1; i < n; i += 2) {
                a[i] = i + 1;
                a[i + 1] = i;
            }


            if (n % 2 == 1) {
                a[n] = n - 1; 
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
