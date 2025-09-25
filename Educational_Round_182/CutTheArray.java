import java.util.*;
public class CutTheArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int p[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i==0){
                    p[i]=a[i];
                }
                else p[i]=a[i]+p[i-1];
            }
            int l=0,r=0;
            boolean stop=false;
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    int s1=p[i]%3;
                    int s2=(p[j]-p[i])%3;
                    int s3=(p[n-1]-p[j])%3;
                    if((s1!=s2&& s2!=s3 && s1!=s3)||(s1==s2&&s2==s3)){
                        l=i+1;
                        r=j+1;
                        stop=true;
                        break;
                    }
                }
                if(stop) break;
            }
            System.out.println(l+" "+r);
        }
    }
}