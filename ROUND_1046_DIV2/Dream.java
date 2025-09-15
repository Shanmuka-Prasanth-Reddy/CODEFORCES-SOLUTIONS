import java.util.*;
public class Dream{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt()-a;
            int d=sc.nextInt()-b;
            int m1=Math.min(a,b);
            int m2=Math.min(c,d);
            System.out.println(a+b-m1<=(m1+1)*2 && (c+d-m2)<=(m2+1)*2?"YES":"NO");
        }
    }
}