import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int cur=1,res1=0,res2=0;
                int turn=0,a1=a,b1=b;
                while(a>0 || b>0){
                    if(turn==0){
                        if(a<cur) break;
                        a-=cur;
                    }
                    else{
                        if(b<cur) break;
                        b-=cur;
                    }
                    cur*=2;
                    res1++;
                    turn^=1;
                }
                turn=1;
                a=a1;
                b=b1;
                cur=1;
                while(a>0||b>0){
                    if(turn==0){
                        if(a<cur) break;
                        a-=cur;
                    }
                    else{
                        if(b<cur) break;
                        b-=cur;
                    }
                    cur*=2;
                    res2++;
                    turn^=1;
            }
            System.out.println(Math.max(res1,res2));
        }
    }
}