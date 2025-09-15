import java.util.*;
public class ReplaceWithOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            TreeMap<Integer,Integer> m=new TreeMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                m.put(a[i],m.getOrDefault(a[i], 0)+1);
            }
            int x=m.lastKey()+1;
            int sum=0;
            int ans=1;
            for(int i:m.keySet()){
                if(m.get(i)%i==0){
                    sum+=m.get(i);
                    m.put(i,m.get(i)/i);
                }
                else{
                    ans=-1;
                    break;
                }
            }
            if(ans==-1){
                System.out.println(ans);
                continue;
            }
            int res[]=new int[n];
            HashMap<Integer,Integer> num=new HashMap<>();
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i:m.keySet()) num.put(i,i);
            for(int i=0;i<n;i++){
                if(mp.getOrDefault(a[i],0)==a[i]){
                    num.put(a[i],x++);
                    mp.put(a[i],0);
                }
                res[i]=num.get(a[i]);
                mp.put(a[i],mp.getOrDefault(a[i], 0)+1);
            }
            for(int i:res){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}