import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            long v1=0,v2=0;
            for(int i=0;i<n;i++){
                long p1=v1-a[i];
                long p2=v2-a[i];
                long p3=b[i]-v1;
                long p4=b[i]-v2;

                v1=Math.max(Math.max(p1,p2),Math.max(p3,p4));
                v2=Math.min(Math.min(p1,p2),Math.min(p3,p4));
            }
            System.out.println(v1);
        }
    }
}