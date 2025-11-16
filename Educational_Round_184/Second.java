import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int n=s.length(),res=0;
            if(n==1 ){
                System.out.println(1);
            }
            else{
                if(s.indexOf(">*")!=-1||s.indexOf("*<")!=-1 || s.indexOf("**")!=-1||s.indexOf("><")!=-1){
                    System.out.println(-1);
                }
                else{
                    int lf=0,rg=0,st=0;
                    for(char c:s.toCharArray()){
                        if(c=='<') lf++;
                        else if(c=='>') rg++;
                        else st++;
                    }
                    System.out.println(Math.max(lf,rg)+st);
                }
            }
        }
    }
}