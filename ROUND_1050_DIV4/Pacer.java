import java.util.*;

public class Pacer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long n=sc.nextLong();
            long last=sc.nextLong();
            long prev=0,val=0,res=0;
            while(n-->0){
                long cur=sc.nextLong();
                long req=sc.nextLong();
                if(val==req){
                    res+=(cur-prev)-(cur-prev)%2;
                }
                else{
                    res+=(cur-prev-1)+(cur-prev)%2;
                }
                prev=cur;
                val=req;
            }
            if(prev<last){
                res+=last-prev;
            }
            System.out.println(res);
        }
    }
}
