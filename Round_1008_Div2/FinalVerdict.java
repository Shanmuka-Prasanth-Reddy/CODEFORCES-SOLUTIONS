/*
 * problem: https://codeforces.com/problemset/problem/2078/A
 */
import java.util.*;
public class FinalVerdict {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int target=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextInt();
            }
            if(sum==target*n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
