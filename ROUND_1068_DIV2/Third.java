import java.util.*;

public class Third{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            int max=0;
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                a.add(x);
                if(x>max) max=x;
            }
            int[] freq=new int[max+1];
            for(int x:a) freq[x]++;
            int[] mul=new int[max+1];
            for(int i=1;i<=max;i++)
                for(int j=i;j<=max;j+=i)
                    mul[i]+=freq[j];
            HashSet<Integer> vis=new HashSet<>();
            ArrayList<Integer> res=new ArrayList<>();
            a.sort(null);
            for(int i=0; i<n; i++){
                int x = a.get(i);
                if(i > 0 && x == a.get(i-1)) continue;
                if(vis.contains(x)) continue;
                if(k/x > Integer.MAX_VALUE || mul[x] == k/x){ 
                    res.add(x);
                    for(int j=x;j<=max;j+=x) vis.add(j);
                }
            }
            boolean ok=true;
            for(int x:a) if(!vis.contains(x)){ok=false;break;}
            for(int x:res){
                if(k/x > Integer.MAX_VALUE || mul[x] != k/x){
                    ok = false;
                    break;
                }
            }
            if(!ok) System.out.println(-1);
            else{
                System.out.println(res.size());
                for(int x:res) System.out.print(x+" ");
                System.out.println();
            }
        }
    }
}