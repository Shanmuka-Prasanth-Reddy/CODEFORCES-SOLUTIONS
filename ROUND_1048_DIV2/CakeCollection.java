import java.util.*;

public class CakeCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            long res=0;
            for(int i=n-1;i>=0 && m>0;i--){
                res+=1L*m*a[i];
                m--;
            }
            System.out.println(res);
        }
    }
}
