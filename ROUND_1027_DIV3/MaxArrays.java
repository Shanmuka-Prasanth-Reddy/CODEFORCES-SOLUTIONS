import java.util.*;
public class MaxArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            int res=1,i=0;
            while(i<n){
                int j=i+1;
                while(j<n && a[i]+1>=a[j] ) {
                    j++;
                }
                if(j<n){
                    res++;
                }
                i=j;
            }
            System.out.println((res));
        }
    }
}
