import java.util.*;

public class CoolPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
        int n = sc.nextInt();
        int a[]=new int[n];
        Map<Integer,TreeSet<Integer>> m=new HashMap<>(); 
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            m.putIfAbsent(a[i],new TreeSet<>());
            m.get(a[i]).add(i);
        }
        int c=0;
        int idx=0,next=0;
        while(idx<n){
            int max=-1;
            for(int i=idx;i<=next;i++){
                Integer cur=m.get(a[i]).higher(i);
                if(cur==null){
                    max=-1;
                    break;
                } 
                max=Math.max(max,cur);
            }
            if(max==-1) break;
            c++;
            idx=next+1;
            next=max;
        }
        System.out.println(c+1);
     }
    }
}
