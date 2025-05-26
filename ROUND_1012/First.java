import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=x+y;
            double a=sc.nextInt()+0.5;
            a%=s;
            System.out.println(a%x==a?"NO":"YES");
        }
    }
}
