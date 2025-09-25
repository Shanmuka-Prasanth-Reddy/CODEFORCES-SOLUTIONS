import java.util.*;
public class MaximumCostPermutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            TreeSet<Integer> s=new TreeSet<>();
            for(int i=0;i<n;i++){
                s.add(i+1);
            }
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]!=0) s.remove(a[i]);
            }
            for(int i=n-1;i>=0;i--){
                if(a[i]==0){
                    a[i]=s.first();
                    s.remove(s.first());
                }
            }
            int l=0,r=n-1;
            while(l<n && a[l]==l+1) l++;
            while(r>=0 && a[r]==r+1) r--;
            System.out.println(l>r?0:r-l+1);
        }
    }
}