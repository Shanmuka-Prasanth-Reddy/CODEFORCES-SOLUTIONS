import java.util.*;
public class Second{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int first=-1,last=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]!=-1){
                    if(first==-1)
                        first=i;
                    last=i;
                }
                

            }
            int val=0;
            for(int i=0;i<n-1;i++){
                int x=a[i+1]==-1?0:a[i+1];
                int y=a[i]==-1?0:a[i];
                val+=x-y;
            }
            if(val!=0){
                if(val>0)
                {
                    if(a[0]==-1){
                        a[0]=val;
                        val=0;
                    }
                }
                else{
                    if(a[n-1]==-1){
                        a[n-1]=-1*val;
                        val=0;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]==-1) a[i]++;
            }
            //System.out.println("ANS->"+t);
            System.out.println(Math.abs(val));
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}