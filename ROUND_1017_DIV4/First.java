import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            System.out.println(sc.next().substring(0,1)+sc.next().substring(0,1)+
            sc.next().substring(0,1));
        }
    }
}