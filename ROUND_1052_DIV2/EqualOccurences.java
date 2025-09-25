import java.util.*;
public class EqualOccurences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            HashMap<Integer,Integer> m=new HashMap<>();
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                m.put(x,m.getOrDefault(x,0)+1);
            }
            ArrayList<Integer> l=new ArrayList<>();
            l.addAll(m.values());
            Collections.sort(l);
            int res=0,size=l.size();
            for(int i=0;i<size;){
                res=Math.max(res,(size-i)*l.get(i));
                while(i+1<size && l.get(i)==l.get(i+1)) i++;
                i++;
            }
            System.out.println(res);
        }
    }
}