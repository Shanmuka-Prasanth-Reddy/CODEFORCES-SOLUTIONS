/*
* Array Recoloring
* Problem Link: https://codeforces.com/contest/2075/problem/B
 * 
 */

import java.util.*;

public class MaxPaintingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            long[] b;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            b=a.clone();
            Arrays.sort(a);
            if(k==1){
                long m=a[n-1],idx=0;
                for(int i=0;i<n;i++){
                    if(b[i]==m){
                        idx=i;
                        break;
                    }
                }
                if(idx==0 || idx==n-1){
                    System.out.println(a[n-1]+a[n-2]);
                }
                else{
                    System.out.println(a[n-1]+Math.max(b[0],b[n-1]));
                }
                continue;
            }
            long res=0;
            for(int i=n-1;i>=n-k-1;i--){
                res+=a[i];
            }
            System.out.println(res);
        }
    }
}
