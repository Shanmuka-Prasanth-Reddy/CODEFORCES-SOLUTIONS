import java.util.*;
public class MultipleConstruction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[2*n];
            Arrays.fill(a,1);
            int idx=0;
            for(int i=n;i>1;i-=2){
                a[idx]=i;
                a[idx+i]=i;
                idx++;
                //System.out.println(idx+" "+Arrays.toString(a));
            }
            for(int i=n-1;i>1;i-=2){
                while(i+idx<2*n && a[idx]!=1 || a[idx+i]!=1) idx++;
                a[idx]=i;
                a[idx+i]=i;
                idx++;
                //System.out.println(idx+" "+Arrays.toString(a));
            }
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}