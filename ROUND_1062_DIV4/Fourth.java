import java.util.*;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> primes=new ArrayList<>();
        boolean p[]=new boolean[100000];
        Arrays.fill(p,true);
        for(int i=2;i<100000;i++){
            if(p[i]){
                primes.add(i);
                for(int j=i*i;i*i>0 && j<100000;j+=i){
                    p[j]=false;
                }
            }
        }
        while (t-->0) {
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);
            long ans=Integer.MAX_VALUE;
            for(long x:a){
                for(int i:primes){
                    if(x%i!=0){
                        ans=Math.min(ans,i);
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
