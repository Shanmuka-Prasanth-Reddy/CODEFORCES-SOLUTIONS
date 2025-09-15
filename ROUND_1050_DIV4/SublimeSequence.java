import java.util.Scanner;

public class SublimeSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int l=sc.nextInt();
            System.out.println(l%2*n);
        }
    }
}
