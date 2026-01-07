import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            int val=(a+b)%l,res=0;
            while(s.add(val)){
                res=Math.max(res,val);
                val=(val+b)%l;
            }
            System.out.println(res);
        }
    }
}