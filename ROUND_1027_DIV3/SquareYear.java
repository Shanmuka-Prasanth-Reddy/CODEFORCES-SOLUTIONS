import java.util.*;
public class SquareYear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            String s=sc.next();
            int n=Integer.parseInt(s);
            int sq=(int)Math.sqrt(n);
            if(sq*sq != n) {
                System.out.println(-1);
            } else {
                System.out.println(0+" "+sq);
            }
        }
    }
}