import java.util.*;
public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int res=n*n/4+1;
            System.out.println(res);
        }
    }
    
}