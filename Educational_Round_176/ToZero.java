/*
 * ToZero
  problem link:https://codeforces.com/problemset/problem/2075/A
 */
import java.util.*;
public class ToZero{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt(),x=k;
            int res=0;
            while(n>0){
                if(n%2==x%2){
                    if(x%2==1){
                        n-=x;
                        res++;
                    }
                    else{
                        res+=(n/x);
                        n%=x;
                    }
                }
                if(n<x){
                    x=n+1;
                }
                x--;
            }
            System.out.println(res);
        }
    }
}