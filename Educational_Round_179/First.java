import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(),c=0;
            int a[] = new int[3];
            while (a[0] < x || a[1] < x || a[2] < x) {
                for (int i = 0; i < 3; i++) {
                    if (a[i] < x) {
                        if (i == 0) {
                            a[0] = Math.min(a[1] * 2, a[2] * 2) + 1;
                        }
                        if (i == 1) {
                            a[1] = Math.min(a[0] * 2, a[2] * 2) + 1;
                        }
                        if (i == 2) {
                            a[2] = Math.min(a[0] * 2, a[1] * 2) + 1;
                        }
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}