import java.util.*;
public class MinimiseSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(n==1) System.out.println(a[0]);
            else if(n==2) System.out.println(Math.min(2*a[0],a[0]+a[1]));
            else{
                if(a[0]==0) System.out.println("0");
                else System.out.println(Math.min(2*a[0],a[1]+a[0]));
            }
        }
    }
}
