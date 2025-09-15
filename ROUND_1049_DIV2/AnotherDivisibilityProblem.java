import java.util.Scanner;

public class AnotherDivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int x = sc.nextInt();
            long y = 1000000000L - 1 - x;
            System.out.println(y);
        }
    }
}
