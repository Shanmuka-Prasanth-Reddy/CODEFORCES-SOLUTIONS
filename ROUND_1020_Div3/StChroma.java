import java.util.*;

public class StChroma {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int x=sc.nextInt();
            int res[]=new int[n];
            for(int i=0;i<x;i++){
                res[i]=i;
            }
            for(int i=x;i<n;i++){
                res[i]=i+1;
            }
            res[n-1]=Math.min(n-1,x);
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}
