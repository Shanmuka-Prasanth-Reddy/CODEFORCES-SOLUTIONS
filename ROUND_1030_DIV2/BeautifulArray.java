import java.util.*;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            long arr[]=new long[n];
            PriorityQueue<long[]> pq = new PriorityQueue<long[]>((a,b)->Long.compare(a[1], b[1]));
            long res=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                res+=Long.bitCount(arr[i]);
                long x=arr[i],val=1;
                while ((x&1)==1) {
                    x>>=1;
                    val<<=1;
                }
                pq.add(new long[]{arr[i],val});
            }
            while (k>0) {
                long bit[]=pq.poll();
                if(bit[1]>k){
                    break;
                }
                else{
                    k-=bit[1];
                    bit[0]+=bit[1];
                    long x=bit[0],val=1;
                    while ((x&1)==1) {
                        x>>=1;
                        val<<=1;
                    }
                    pq.add(new long[]{bit[0],val});
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
