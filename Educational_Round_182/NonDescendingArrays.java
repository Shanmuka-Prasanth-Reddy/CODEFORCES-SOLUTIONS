import java.util.*;

public class NonDescendingArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=998244353;
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            for(int i=0;i<n;i++) b[i]=sc.nextInt();
            int dp[][]=new int[n][2];
            dp[0][0]=1;dp[0][1]=1;
            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1] && b[i] >= b[i - 1]) {
                    dp[i][0] = (dp[i][0] + dp[i - 1][0]) % m;
                }
                if (a[i] >= b[i - 1] && b[i] >= a[i - 1]) {
                    dp[i][0] = (dp[i][0] + dp[i - 1][1]) % m;
                }
                if (b[i] >= a[i - 1] && a[i] >= b[i - 1]) {
                    dp[i][1] = (dp[i][1] + dp[i - 1][0]) % m;
                }
                if (b[i] >= b[i - 1] && a[i] >= a[i - 1]) {
                    dp[i][1] = (dp[i][1] + dp[i - 1][1]) % m;
                }
            }
            long ans = (dp[n - 1][0] + dp[n - 1][1]) % m;
            System.out.println(ans);
        }
    }
}
