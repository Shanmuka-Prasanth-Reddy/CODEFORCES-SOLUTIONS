import java.util.*;
public class Second{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++){
                if(Math.abs(a[i])<Math.abs(a[0]))
                {
                    c++;
                }
            }
            System.out.println(c<=n/2?"YES":"NO");
        }
    }
}