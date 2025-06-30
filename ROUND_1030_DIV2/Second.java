import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println((n-1)*2);
            for(int i=0;i<(n-3);i++){
                System.out.println((i+3)+" "+(i+1)+" "+n);
                System.out.println((i+3)+" "+1+" "+n);
            }
        }
    }
}