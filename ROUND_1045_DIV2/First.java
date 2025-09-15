import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            if((n-Math.max(a,b))%2==1) System.out.println("NO");
            else if(b>=a) System.out.println("YES");
            else if(a>b) System.out.println((a-b)%2==0?"YES":"NO");
        }
    }
}
