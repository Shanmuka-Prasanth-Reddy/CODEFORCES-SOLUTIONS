import java.util.*;

public class TheCunningSeller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long a[]=new long[19];
        a[0]=3;
        for(int i=1;i<19;i++){
            a[i]=(long)(Math.pow(3,i+1)+(i)*Math.pow(3,i-1));
        }
        //System.out.println(Arrays.toString(a));
        while (t-->0) {
            int n=sc.nextInt();
            long res=0;
            long cur=(long)Math.pow(3,18);
            int idx=18;
            while(n>0){
                while(cur>n){
                    cur/=3;
                    idx--;
                }
                res+=(n/cur)*a[idx];
                n%=cur;
            }
            System.out.println(res);
        }
    }
}
