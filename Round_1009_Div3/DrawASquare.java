/*
 * 
 */
import java.util.*;
public class DrawASquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int d=sc.nextInt();
            int u=sc.nextInt();
            System.out.println(l==r&&r==d&&d==u?"YES":"NO");
        }
    }
}