import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            char c[]=sc.next().toCharArray();
            int res=0,n=c.length;
            if(c[0]=='u'){
                res++;
                c[0]='s';
            }
            if(c[n-1]=='u'){
                res++;
                c[n-1]='s';
            }
            for(int i=1;i<n-1;i++){
                if(c[i]=='u'){
                    if(c[i+1]!='s'){
                        res++;
                        c[i+1]='s';
                    }
                }
            }
            System.out.println(res);
        }
    }
}