import java.util.*;
public class DerangedDeletions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int idx=-1;
            for(int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    idx=i;
                    break;
                }
            }
            if(idx==-1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
                System.out.println(2);
                System.out.println(a[idx]+" "+a[idx+1]);
            }
        }
    }
}