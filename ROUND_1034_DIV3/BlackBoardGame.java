import java.util.*;
public class BlackBoardGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(); 
            System.out.println(n%4!=0?"Alice":"Bob");
        }
    }
}