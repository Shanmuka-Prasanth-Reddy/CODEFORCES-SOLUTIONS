import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int l1=-1*(m/2);
            int r1=1*((m+1)/2);
            if(r1>r){
                l1-=(r1-r);
                r1=r;
            }
            if(l1<l){
                r1+=(l-l1);
                l1=l;
            }
            System.out.println(l1+" "+r1);
        }
    }
}