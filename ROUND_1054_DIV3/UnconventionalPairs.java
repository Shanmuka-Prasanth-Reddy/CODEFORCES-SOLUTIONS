import java.util.*;
public class UnconventionalPairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            long res=Long.MIN_VALUE;
            for(int i=0;i<n;i+=2){
                res=Math.max(res,Math.abs(a[i+1]-a[i]));
            }
            System.out.println(res);
        }
    }
}