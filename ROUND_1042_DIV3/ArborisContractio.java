import java.util.*;

public class ArborisContractio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<Integer>[] g=new ArrayList[n+1];
            for(int i=1;i<=n;i++) g[i]=new ArrayList<>();
            for(int i=0;i<n-1;i++){
            int u=sc.nextInt(),v=sc.nextInt();
            g[u].add(v);
            g[v].add(u);
            }
            if(n<=2){
            System.out.println(0);
            continue;
            }
            int[] deg=new int[n+1];
            for(int i=1;i<=n;i++) deg[i]=g[i].size();
            int total=0;
            for(int i=1;i<=n;i++) if(deg[i]==1) total++;
            int max=0;
            for(int i=1;i<=n;i++){
            int cnt=0;
            for(int nb:g[i]) if(deg[nb]==1) cnt++;
            if(cnt>max) max=cnt;
            }
            System.out.println(total-max);
        }
    }
}
