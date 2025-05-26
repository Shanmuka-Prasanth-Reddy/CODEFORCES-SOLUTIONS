import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (n == 1) {
            System.out.println(x == 0 ? -1 : x);
            continue;
        }
        if(x==0){
            if(n%2==0){
                System.out.println(n);
                continue;
            }
            else{
                System.out.println(n+3);
                continue;
            }
        }
        if(x==1){
            if(n%2==0){
                System.out.println(n+3);
                continue;
            }
            else{
                System.out.println(n);
                continue;
            }
        }
        int y = Integer.bitCount(x);

        if (y > n) {
            System.out.println(x);
            continue;
        }

        int ans = x + (n - y);

        if ((n - y) % 2 != 0) { 
            ans+=1;
        }

        System.out.println(ans);
    }
}
}
