import java.util.*;
public class BePositive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int res=0,z=0,o=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x==-1) o++;
                else if(x==0) z++;
            }
            if(o%2==1) res+=2;
            if(z>0) res+=z;
            System.out.println(res);
        }
    }
}