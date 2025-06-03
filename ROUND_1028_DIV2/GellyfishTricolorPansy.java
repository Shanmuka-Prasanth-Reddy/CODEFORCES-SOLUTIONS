import java.util.*;
public class GellyfishTricolorPansy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int hp1=Math.min(a,c),hp2=Math.min(b,d);
            System.out.println(hp1==hp2?"Gellyfish":hp1>hp2?"Gellyfish":"Flower");
        }
    }
}