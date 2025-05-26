import java.util.*;
public class First{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(),l=0,r=0;
            String s=sc.next();
            int a[]=new int[n];
            for(char c:s.toCharArray()){
                if(c=='<') l++;
            }
            int sum=(n*(n+1))/2;
            r=l+2;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)=='<'){
                    a[i+1]=l--;
                }
                else{
                    a[i+1]=r++;
                }
                sum-=a[i+1];
            }
            a[0]=sum;
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}