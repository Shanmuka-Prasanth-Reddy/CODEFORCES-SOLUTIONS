import java.util.*;

public class IWillDefinitelyMakeIt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            long req=a[k-1];
            Arrays.sort(a);
            int i=0;
            long cur=1;
            while (i+1<n && a[i+1]<=req) {
                i++;
            }
            if(i==n) System.out.println("YES");
            else{
                String ans="YES";
                while(i<n-1){
                    if((a[i+1]-a[i]+cur-1)>a[i]){
                        ans="NO";
                        break;
                    }
                    cur+=(a[i+1]-a[i]);
                    i++;
                }
                System.out.println(ans);
            }
        }
    }
}
