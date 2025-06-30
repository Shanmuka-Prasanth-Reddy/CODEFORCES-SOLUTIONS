import java.util.*;
public class Race{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                int z=x;
                x=y;
                y=z;
            }
            if((a>=x && a<=y)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}