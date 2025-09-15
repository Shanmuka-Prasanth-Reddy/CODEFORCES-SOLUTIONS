import java.util.*;

public class MakeItEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            HashMap<Integer,Integer> m1=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                m1.put(x%k,m1.getOrDefault(x%k,0)+1);
            }
            HashMap<Integer,Integer> m2=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                m2.put(x%k,m2.getOrDefault(x%k,0)+1);
            }
            int c=n;
            for(int i:m1.keySet()){
                int v=Math.min(m1.get(i),m2.getOrDefault(i,0));
                c-=v;
                m1.put(i,m1.get(i)-v);
                m2.put(i,m2.getOrDefault(i,0)-v);
                v=Math.min(m1.get(i),m2.getOrDefault(Math.abs(i-k),0));
                c-=v;
                m1.put(i,m1.get(i)-v);
                m2.put(Math.abs(i-k),m2.getOrDefault(Math.abs(i-k),0)-v);
            }
            System.out.println(c==0?"YES":"NO");
        }
    }
}
