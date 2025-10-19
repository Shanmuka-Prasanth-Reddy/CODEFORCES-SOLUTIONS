import java.util.*;
public class Third{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            //System.out.println("For"+a+","+b+"ans:-");
            if(a==b) System.out.println(0);
            else if(a<b){
                if((a^b)>a)
                    System.out.println(-1);
                else{
                    System.out.println(1);
                    System.out.println(a^b);
                }
            }
            else{
                long x=a^b;
                if(x>a){
                    if((a&b)==0)
                    {System.out.println(2);
                    System.out.println(b+" "+a);}
                    else{
                        System.out.println(3);
                        long and=a&b;
                        System.out.println(and+" "+b+" "+(and^a));
                    }
                }
                else{
                    System.out.println(1);
                    System.out.println(x);
                }
            }
        }
    }
}