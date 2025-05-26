import java.util.*;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String p = sc.next();
            String s = sc.next();
            int i = 0, j = 0;
            boolean res = true;
            while (i < p.length() && j < s.length()) {
                char ch1 = p.charAt(i);
                int c = 0;
                while (i < p.length() && p.charAt(i) == ch1) {
                    c++;
                    i++;
                }
                char ch2 = s.charAt(j);
                int tc = 0;
                while (j < s.length() && s.charAt(j) == ch2) {
                    tc++;
                    j++;
                }
                if (ch1 != ch2 || tc < c || tc > 2 * c) {
                    res = false;
                    break;
                }
            }
            if (i != p.length() || j != s.length()) res = false;
            System.out.println(res ? "YES" : "NO");
        }
    }
}
