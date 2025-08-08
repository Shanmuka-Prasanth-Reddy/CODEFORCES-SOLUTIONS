import java.util.*;
public class NoCasinoInTheMountains{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=1;i<n;i++){
                a[i]+=a[i-1];
            }
            int res=0;
            for(int i=0;i<=n-k;i++){
                if(i-1>=0 && a[i+k-1]-a[i-1]==0 || a[i+k-1]==0){
                    res++;
                    i+=k;
                }
            }
            System.out.println(res);
        }
    }
}