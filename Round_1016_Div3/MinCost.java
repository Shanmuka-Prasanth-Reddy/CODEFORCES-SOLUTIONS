import java.util.Scanner;

public class MinCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int max=1,c;
            int a[]=new int[s.length()];
            a[0]=s.charAt(0)-'0';
            for(int i=1;i<s.length();i++){
                a[i]=((int)(s.charAt(i)-'0'));
            }
            int z=0;
            for(int i:a){
                if(i==0) z++;
                else{
                    max=z+1;
                }
            }
            System.out.println(s.length()-max);
        }
    }
}
