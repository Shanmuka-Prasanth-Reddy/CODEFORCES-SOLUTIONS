import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b){
                System.out.println(0);
            }
            else{
                if(b%a==0||a%b==0) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}