import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int res=0;
            int a[]=new int[n];
            int b[]=new int[m];
            int c[]=new int[m];
            int id[]=new int[m];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<m;i++) b[i]=sc.nextInt();
            for(int i=0;i<m;i++) c[i]=sc.nextInt();
            for(int i=0;i<m;i++) id[i]=i;
            Arrays.sort(id,(p,q)->b[p]-b[q]);
            PriorityQueue<Integer> sw=new PriorityQueue<>();
            for(int x:a) sw.add(x);
            PriorityQueue<Integer> pq=new PriorityQueue<>((p,q)->c[q]-c[p]);
            int j=0;
            while(!sw.isEmpty()){
                int cur=sw.poll();
                while(j<m && b[id[j]]<=cur){
                    pq.add(id[j]);
                    j++;
                }
                if(pq.isEmpty()) continue;
                int k=pq.poll();
                res++;
                if(c[k]>0) sw.add(Math.max(cur,c[k]));
            }
            System.out.println(res);
        }
    }
}
