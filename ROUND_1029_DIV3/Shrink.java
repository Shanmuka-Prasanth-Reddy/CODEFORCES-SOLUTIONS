import java.util.*;

public class Shrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans[]=new int[n];
            int l=0,r=n-1,x=0;
            for(int i=1;i<=n;i++){
                if(x==0) ans[l++]=i;
                else ans[r--]=i;
                x^=1;
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
