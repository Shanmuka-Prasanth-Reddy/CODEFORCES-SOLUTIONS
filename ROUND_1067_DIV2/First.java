import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            int total=r+y/2;
            System.out.println(Math.min(total,n));
        }
    }
}