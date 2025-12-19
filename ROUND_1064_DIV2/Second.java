import java.util.*;
public class Second{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            if(a/n<b && b<a){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}