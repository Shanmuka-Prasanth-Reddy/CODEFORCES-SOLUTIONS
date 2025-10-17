import java.util.*;
public class First{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            solve();
        }
    }
    public static void solve(){
        int n=sc.nextInt();
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++) s.add(sc.nextInt());
        System.out.println(s.size());
    }
}