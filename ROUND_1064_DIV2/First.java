import java.util.*;
public class First{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            int a[]=new int[26];
            for(char c:s.toCharArray()){
                a[c-'a']++;
            }
            System.out.println(n-a[s.charAt(n-1)-'a']);
        }
    }
}