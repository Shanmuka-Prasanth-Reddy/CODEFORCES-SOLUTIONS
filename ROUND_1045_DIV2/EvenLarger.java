import java.util.*;

public class EvenLarger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            long res=0;
            for(int i=0;i<n-2;i+=2){
                if(a[i]+a[i+2]>a[i+1]){
                    long sum=a[i]+a[i+2]-a[i+1];
                        long rem=Math.min(sum,a[i+2]);
                        sum-=rem;
                        res+=rem;
                        a[i+2]-=rem;
                        if(sum>0){
                            a[i]-=sum;
                            res+=sum;
                        }
                }
            }
            if(n==2){
                if(a[0]>a[1]){
                    res+=a[0]-a[1];
                    a[0]-=(a[0]-a[1]);
                }
            }
            if(n==3 && a[0]+a[2]>a[1]) res+=a[1]-a[0];
            if(n%2==0 && n>=2){
                if(a[n-2]>a[n-1]) res+=(a[n-2]-a[n-1]);
            }
            System.out.println(res);
        }
    }
}
