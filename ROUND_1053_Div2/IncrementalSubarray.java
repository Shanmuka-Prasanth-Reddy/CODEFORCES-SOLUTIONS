import java.util.*;
public class IncrementalSubarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean inc=true;
            for(int i=1;i<n;i++){
                if(a[i]<=a[i-1]){
                    inc =false;
                    break;
                }
            }
            if(inc){
                System.out.println((m-a[n-1]+1));
            }
            else System.out.println(1);
        }
    }
}