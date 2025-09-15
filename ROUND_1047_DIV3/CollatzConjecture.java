import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int k=sc.nextInt();
            int x=sc.nextInt();
            for(int i=0;i<k;i++) x*=2;
            System.out.println(x);
        }
    }
}