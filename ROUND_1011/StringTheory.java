import java.util.*;

public class StringTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] c=s.toCharArray();
            int st=0,e=n-1;
            while(st<=n/2 && k>0){
                if(c[st]==c[e]){
                    st++;
                    e--;
                }
                else if(c[e]>c[st]){
                    System.out.println("YES");
                    st=n/2;
                    break;
                }
                else{
                    System.out.println("NO");
                    break;
                }
            }   
         }
    }
}