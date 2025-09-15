import java.util.*;

public class MaximumEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a%2==1 && b%2==1){
                System.out.println(1+b*a);
            }
            else{
                if(b%2==1) System.out.println(-1);
                else{
                    System.out.println((2+(a*b/2))%2==1?-1:(2+(a*b/2)));
                }
            }
        }
    }
}
