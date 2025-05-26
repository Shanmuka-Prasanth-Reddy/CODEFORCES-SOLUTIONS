import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int c=n/p,r=n%p;
            if(r==0){
                if(m==c*q){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else
            System.out.println("YES");
        }
    }
}
