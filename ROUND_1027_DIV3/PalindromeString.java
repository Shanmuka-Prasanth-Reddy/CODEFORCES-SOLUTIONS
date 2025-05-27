import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt(),o=0,z=0;
            String s = sc.next();
            for(char c : s.toCharArray()) {
                if (c =='1') o++;
                else z++;
            }
            int pos=z/2+o/2;
            int min=Math.min(o, z)-o%2;
            //System.out.println("o: " + o + ", z: " + z + ", pos: " + pos + ", min: " + min);
            if ((pos-k)%2!=0 || pos-min > k ) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
