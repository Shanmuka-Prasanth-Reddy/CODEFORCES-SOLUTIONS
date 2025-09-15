import java.util.*;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(),res=0;
            char a[]=sc.next().toCharArray();
            char c[] = Arrays.copyOf(a, n);
            for(int i=0;i<n;i++){
                if(a[i]=='1') res++;
            }
            Arrays.sort(c);
            for(int i=0;i<n;i++){
                if(a[i]=='1' && a[i]==c[i]) res--;
            }
            System.out.println(res);
        }
    }
}