import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(),z=0,o=0;
            char c[]=sc.next().toCharArray();
            for(int i=0;i<n;i++){
                if(c[i]=='0') z++;
            }
            System.out.println(z);
            if(z>0)
            for(int i=0;i<n;i++){
                if(c[i]=='0')
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}