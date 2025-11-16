import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int val=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int less=0,eq=0;
            for(int i=0;i<n;i++){
                if(a[i]<val) less++;
                else if(a[i]==val) eq++;
            }
            int high=n-less-eq;
            System.out.println(less>high?val-1:val+1);
        }
    }
}