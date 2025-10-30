import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            char c[]=sc.next().toCharArray();
            char d[]=sc.next().toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            System.out.println(Arrays.equals(c,d)?"YES":"NO");
        }
    }
}