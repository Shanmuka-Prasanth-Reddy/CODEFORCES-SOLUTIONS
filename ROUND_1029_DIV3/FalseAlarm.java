import java.util.*;
public class FalseAlarm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt(),c=0,s=-1,end=-1;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1){
                    if(s==-1) s=i;
                    end=i;
                }
            }
            System.out.println(end-s+1>x?"NO":"YES");
        }
    }
}