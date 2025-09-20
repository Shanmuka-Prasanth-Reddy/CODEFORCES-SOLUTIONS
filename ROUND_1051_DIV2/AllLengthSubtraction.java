import java.util.*;
public class AllLengthSubtraction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            String ans="YES";
            for(int i=0;i<n;i++){
                int c=0;
                if(i-1>=0 && a[i-1]>a[i]) c++;
                if(i+1<n && a[i]<a[i+1]) c++;
                if(c==2){
                    ans="NO";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}