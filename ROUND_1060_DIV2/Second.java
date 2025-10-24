import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int max=0;
            for(int i=0;i<n;i++){
                max=Math.max(a[i],max);
                if(i%2==1){
                    a[i]=max;
                }
            }
            long res=0;
            for(int i=0;i<n-1;i++){
                if(i%2==0)
                {
                    if(a[i]>=a[i+1]) res+=(a[i]-a[i+1]+1);
                }
                else{
                    if(a[i]<=a[i+1]){
                        res+=a[i+1]-a[i]+1;
                        a[i+1]-=(a[i+1]-a[i]+1);
                    }
                }
                //System.out.print(res+"->");
            }
            System.out.println(res);
        }
    }
}
