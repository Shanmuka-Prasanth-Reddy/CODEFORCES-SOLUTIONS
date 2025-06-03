import java.util.*;
public class GellyfishAndFlamingPeony {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            TreeSet<Integer> set = new TreeSet<>();
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                set.add(a[i]);
            }
            int gcd=a[0];
            for(int i=1; i<n; i++) {
                gcd = gcd(gcd, a[i]);
            }
            int count=0;
            for(int i=0; i<n; i++) {
                if(a[i] == gcd) {
                    count++;
                }
            }
            if(count>0){
                System.out.println(n-count);
                continue;
            }
            int max=set.last();
            int ways[]=new int[max+1];
            Arrays.fill(ways, -1);
            Queue<Integer> q = new LinkedList<>();
            for(int i:set) {
                ways[i] = 0;
                q.add(i);
            }
            while(!q.isEmpty()){
                int curr=q.poll();
                if(curr == gcd) {
                    break;
                }
                for(int x:set){
                    int changed=gcd(curr,x);
                    if(ways[changed]==-1){
                        ways[changed]=ways[curr]+1;
                        q.add(changed);
                    } 
                }
            }
            int res=ways[gcd]+(n-1);
            System.out.println(res);
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
