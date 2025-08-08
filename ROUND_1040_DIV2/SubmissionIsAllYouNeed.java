import java.util.*;
public class SubmissionIsAllYouNeed{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int res=0;
            for(int i=0;i<n;i++){
                if(a[i]!=0)
                res+=a[i];
                else res++;
            }
            System.out.println(res);
        }
    }
}