import java.util.*;
public class Tournament {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int j=sc.nextInt()-1;
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                if(j!=i && a[i]<=a[j]){
                    c++;
                }
            }
            int l=c;
            int r=n-c-1;
            if(r>0){
                l+=(r-1);
            }
            //System.out.println(l);
            if(n-l<=k){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
