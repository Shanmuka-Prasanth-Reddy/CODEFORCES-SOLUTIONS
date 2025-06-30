import java.util.*;
public class Shashliks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int res=0;
            if(x<=y){
                if(k>=a)
                res+=(k-a+1)/x;
                k-=res*x;
                if(k>=a){
                    res++;
                    k-=x;
                }
                if(k>=b)
                res+=(k-b+1)/y;
                k-=y*((k-b+1)/y);
                if(k>=b) res++;
            }
            else{
                if(k>=b)
                res+=(k-b)/y;
                k-=res*y;
                if(k>=b){
                    res++;
                    k-=y;
                }
                if(k>=a)
                res+=(k-a+1)/x;     
                k-=x*((k-a+1)/x);
                if(k>=a) res++;       
            }
            System.out.println(res);
        }
    }
}