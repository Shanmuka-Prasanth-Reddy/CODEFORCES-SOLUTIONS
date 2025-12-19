import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            char c[]=sc.next().toCharArray();
            int res=0,idx=-1;
            for(int i=0;i<n;i++){
                if(c[i]=='0'){
                    if(idx<i)
                    res++;
                }
                else{
                    idx=i+k;
                }
            }
            System.out.println(res);
        }
    }
}