import java.util.*;
public class AdjacentXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            int op[]=new int[n];
            if(a[n-1]!=b[n-1]){
                System.out.println("NO");
                continue;
            }
            op[n-1]=b[n-1];
            String ans="YES";
            for(int i=n-2;i>=0;i--){
                if(a[i]==b[i]){
                    op[i]=b[i];
                }
                else{
                    if((a[i]^op[i+1])==b[i]||(a[i]^a[i+1])==b[i]){
                        op[i]=b[i];
                    }
                    else{
                        ans="NO";
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
