import java.util.*;

public class FunPermuatation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int q[]=new int[n];
            for(int i=0;i<n;i++)
                q[i]=sc.nextInt();
            int res[]=new int[n];
            for(int i=0;i<n;i++){
                res[i]=n+1-q[i];
            }
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
