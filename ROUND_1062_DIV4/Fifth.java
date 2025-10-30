import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++) a[i]=sc.nextLong();
            long start=0,end=0;
            for(long i:a){
                if(i>k){
                    start+=(i-k);
                }
            }
            for(long i:a){
                if(i<=x-k){
                    end+=(x-k-i-1);
                }
            }
            if(start<end){
                for(int i=0;i<k;i++){
                    System.out.print(i+" ");
                }
            }
            else{
                for(int i=x-k+1;i<=x;i++){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
