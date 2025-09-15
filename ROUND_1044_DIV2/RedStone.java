import java.util.*;
public class RedStone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> m=new HashMap<>();
            String ans="NO";
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                m.put(x,m.getOrDefault(x,0)+1);
                if(m.get(x)>1) ans="Yes";
            }
            System.out.println(ans);
        }
    }
}