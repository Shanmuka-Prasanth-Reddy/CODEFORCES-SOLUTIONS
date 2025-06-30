import java.util.*;

public class LostSoul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            HashMap<Integer,Integer> m1=new HashMap<>();
            HashMap<Integer,Integer> m2=new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int ans=0;
            for(int i=n-1;i>=0;i--){
                //System.out.println(m1+" "+m2);
                if(a[i]==b[i] || m1.containsKey(a[i]) || m2.containsKey(b[i])){
                    ans=i+1;
                    break;
                }
                if(m2.containsKey(a[i])){
                    int c=m2.get(a[i]);
                    if(i+1<n && b[i+1]==a[i]){
                        c--;
                    }
                    if(c>0){
                        ans=i+1;
                        break;
                    }
                }
                if(m1.containsKey(b[i])){
                    int c=m1.get(b[i]);
                    if(i+1<n && a[i+1]==b[i]){
                        c--;
                    }
                    if(c>0){
                        ans=i+1;
                        break;
                    }
                }
                m1.put(a[i],m1.getOrDefault(a[i],0)+1);
                m2.put(b[i],m2.getOrDefault(b[i],0)+1);
            }
            System.out.println(ans);
        }
    }
}
