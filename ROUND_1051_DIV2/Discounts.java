import java.util.*;
public class Discounts{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int ai=n-1;
            long sum=0;
            for(int i:b){
                i--;
                boolean stop=false;
                while(i>0){
                    if(ai==-1){
                        stop=true;
                        break;
                    }
                    sum+=a[ai--];
                    i--;
                }
                ai--;
                if(ai<0||stop) break;
            }
            while(ai>=0) sum+=a[ai--];
            System.out.println(sum);
        }
    }
}