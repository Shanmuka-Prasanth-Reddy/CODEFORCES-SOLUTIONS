import java.util.*;
public class Betting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            TreeMap<Integer, Integer> m= new TreeMap<>();
            for(int i=0;i<n;i++){
                m.put(a[i],m.getOrDefault(a[i],0)+1);
            }
            boolean res=false;
            HashSet<Integer> s= new HashSet<>();
            for(int i:m.keySet()){
               int d1=i+1,d2=i+2,k=0;
               if(s.contains(d1)) k+=2;
               if(s.contains(d2)) k+=2;
               if(m.get(i)>=4-k){
                     res=true;
                     System.out.println(s+" "+k+" "+i);
                     break;
               }
               s.add(i+1);
                s.add(i+2);
            }
            System.out.println(res?"YES":"NO");
        }
    }
}
