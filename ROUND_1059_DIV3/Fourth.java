import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            System.out.println(1+" "+1+" "+n);
            System.out.flush();
            long x=sc.nextLong();
            System.out.println(2+" "+1+" "+n);
            System.out.flush();
            x-=sc.nextLong();x*=-1;
            int l=1,r=n;
            while (true) {
                int m=(l+r)/2;
                if(l==r && x==1){
                    System.out.println("! "+(l)+" "+(l));
                    break;
                }
                System.out.println(1+" "+l+" "+m);System.out.flush();
                long a=sc.nextLong();
                System.out.println(2+" "+l+" "+m);System.out.flush();
                long b=sc.nextLong();
                b-=a;
                if(b>0){
                    if(b==x){
                        r=m;
                    }
                    else{
                        System.out.println("! "+(m-b+1)+" "+(m-b+x));System.out.flush();
                        break;
                    }
                }
                else{
                    l=m+1;
                }
            }
        }
    }
}
