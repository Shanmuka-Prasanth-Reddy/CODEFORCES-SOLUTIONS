import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt();
            long res=n/2;
            if(n%2==0){
                res--;
            }
            System.out.println(res);
        }
    }
}