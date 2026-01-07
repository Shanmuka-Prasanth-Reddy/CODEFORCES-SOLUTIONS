import java.util.*;

public class Third{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                c[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);
            TreeMap<Integer,Integer> m1=new TreeMap<>();
            TreeMap<Integer,Integer> m2=new TreeMap<>(Collections.reverseOrder());
            for(int i:b) m1.put(i,m1.getOrDefault(i,0)+1);
            for(int i:c) m2.put(i,m2.getOrDefault(i,0)+1);
            for(int i:m2.keySet()){
                if(m2.higherKey(i)!=null){
                    m2.put(m2.higherKey(i),m2.get(m2.higherKey(i))+m2.get(i));
                }
            }
            HashMap<Integer,Integer> frequency=new HashMap<>();
            for(int i:m1.keySet()){
                if(m2.floorEntry(i+1)!=null)
                frequency.put(i,m2.floorEntry(i+1).getValue());
            }
            System.out.println(m1+" "+m2+" "+frequency);
            long res=0;
            for(int i:a){
                for(int j:m1.keySet()){
                    if(j>i){
                        res+=m1.get(j)*frequency.getOrDefault(j,0);
                    }
                }
            }
            System.out.println("-->"+res);
        }
    }
}