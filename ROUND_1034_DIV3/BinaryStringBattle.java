import java.util.*;

public class BinaryStringBattle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(),c=0;
            String s = sc.next();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0') c++;
            }
            if(n-c<=k){
                System.out.println("Alice");
            }
            else{
                
            }
        }
    }
}
