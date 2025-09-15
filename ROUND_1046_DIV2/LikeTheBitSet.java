import java.util.*;
public class LikeTheBitSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            char s[]=sc.next().toCharArray();
            int cur=0;
            String ans="YES";
            for(int i=0;i<n;i++){
                if(s[i]=='1') cur++;
                else cur=0;
                if(cur>=k){
                    ans="NO";
                    break;
                }
            }
            if(ans.equals("NO")) System.out.println("NO");
            else{
                int res[]=new int[n];
                int val=1;
                for(int i=0;i<n;i++){
                    if(s[i]=='1') res[i]=val++;
                }
                for(int i=0;i<n;i++) 
                    if(res[i]==0) res[i]=val++;
                System.out.println("YES");
                for(int i:res)
                    System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}