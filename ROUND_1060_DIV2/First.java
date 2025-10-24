import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt(),res=0;
            char c[]=sc.next().toCharArray();
            if(c[0]=='1') res++;
            for(int i=1;i<n;i++){
                if(c[i]=='1')
                {
                    res++;
                    for(int j=i-1;j>=Math.max(0,i-k+1);j--){
                        if(c[j]=='1'){
                            res--;break;
                        } 
                   }
                }
            }
            System.out.println(res);
        } 
    }
}