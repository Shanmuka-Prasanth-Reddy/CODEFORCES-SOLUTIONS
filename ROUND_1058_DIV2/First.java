import java.util.*;
public class First{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            if(a[0]!=0 ) System.out.println(0);
            else{
                HashSet<Integer> s=new HashSet<>();
                for(int i:a){
                    s.add(i);
                }
                int mex=1;
                for(int i=1;i<=100;i++) if(s.contains(mex)) mex++;
                System.out.println(mex);
            }
        }
    }
}