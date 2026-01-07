import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String a[]=new String[n];
            for(int i=0;i<n;i++){
                a[i]=sc.next();
            }
            StringBuilder sb=new StringBuilder();
            sb.append(a[0]);
            for(int i=1;i<n;i++){
                int cmp=(a[i]+sb).compareTo((sb+a[i]).toString());
                if(cmp<0) sb.insert(0,a[i]);
                else sb.append(a[i]);
                
            }
            System.out.println(sb);
        }
    }
}
