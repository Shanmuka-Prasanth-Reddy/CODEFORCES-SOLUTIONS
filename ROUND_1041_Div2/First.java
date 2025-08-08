import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            HashSet<Integer> s=new HashSet<>();
            for(int i=0;i<n;i++){
                s.add(sc.nextInt());
            }
            s.remove(-1);
            System.out.println(s.size()==0 || s.size()==1 && !s.contains(0)?"YES":"NO");
        }
    }
}