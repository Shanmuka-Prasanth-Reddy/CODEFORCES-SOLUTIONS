import java.util.*;
public class Second{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            solve();
        }
    }
    public static void solve(){
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a[][]=new int[3][32];
        int i=0,t=x;
        while(t>0){
            a[0][i]+=(t&1);
            a[1][i++]+=(t&1);
            t>>=1;
        }
        i=0;t=y;
        while(t>0){
            a[1][i]+=(t&1);
            a[2][i++]+=(t&1);
            t>>=1;
        }
        i=0;t=z;
        while(t>0){
            a[2][i]+=(t&1);
            a[0][i++]+=(t&1);
            t>>=1;
        }
        //for(int k[]:a) System.out.println(Arrays.toString(k));
        String ans="YES";
        int p=0,q=0,r=0;
        for(i=0;i<32;i++) if(a[0][i]>=1 && a[1][i]>=1) p+=(1<<i);
        for(i=0;i<32;i++) if(a[2][i]>=1 && a[1][i]>=1) q+=(1<<i);
        for(i=0;i<32;i++) if(a[0][i]>=1 && a[2][i]>=1) r+=(1<<i);
        //System.out.println(p+"-"+q+"-"+r);
        if(p!=x||q!=y||r!=z) ans="NO";
        System.out.println(ans);
    }
}