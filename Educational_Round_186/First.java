import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            //char c[]=s.toCharArray();
            if(s.indexOf("2026")!=-1||s.indexOf("2025")==-1) System.out.println(0);
            else System.out.println(1);
        }
    }
}