import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n+1];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i+1]=b[i]+a[i];
            }
            int res=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int avg=(b[j+1]-b[i])/(j-i+1);
                    res=Math.max(res,avg);
                }
            }
            System.out.println(res);
        }
    }
}