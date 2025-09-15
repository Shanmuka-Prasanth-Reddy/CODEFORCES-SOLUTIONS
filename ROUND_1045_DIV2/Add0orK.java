import java.util.*;
public class Add0orK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while (t-->0) {
            int n=sc.nextInt();
            long k=sc.nextLong(),max=0;
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
                max=Math.max(max,a[i]);
            }
            if(n==1) System.out.println(a[0]+k);
            else{
                if(k%2==1){
                    for(int i=0;i<n;i++){
                        a[i]=a[i]%2==0?a[i]:a[i]+k;
                    }
                }
                else{
                    long gcd=k+1;
                    for(int i=0;i<n;i++){
                        if(a[i]%gcd!=0){
                            long rem=gcd-(a[i]%gcd);
                            a[i]=a[i]+((gcd-rem)*k);
                        }
                    }
                }
                for(long i:a){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}