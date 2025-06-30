import java.util.*;

public class First {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            StringBuilder sb = new StringBuilder();
            
            for(int i=0;i<k;i++){
                sb.append('1');
            }
            for(int i=k;i<n;i++) sb.append('0');
            System.out.println(sb);
        }
    }
}