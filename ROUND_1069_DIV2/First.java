import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> s=new HashSet<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                s.add(a[i]);
            }
            int x=s.size();
            while(!s.contains(x)){
                s.add(x);
                x++;
            }
            System.out.println(x);
        }
    }
}