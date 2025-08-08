import java.util.*;
public class OnlyOneDigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            char c[]=sc.next().toCharArray();
            Arrays.sort(c);
            System.out.println(c[0]);
        }
    }
}