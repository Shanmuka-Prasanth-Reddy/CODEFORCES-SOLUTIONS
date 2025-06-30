import java.util.*;
public class Retaliation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long b=(2*a[0]-a[1])/((2*n)-(n-1));
            long ax=a[0]-b*n;
            String ans="YES";
            for(int i=0;i<n;i++){
                int f=i+1,s=n-i;
                if(ax*f+s*b!=a[i]){
                    ans="NO";
                    break;
                }
            }
            if(ax<0 || b<0) ans="NO";
            System.out.println(ans);
        }
    }
}
