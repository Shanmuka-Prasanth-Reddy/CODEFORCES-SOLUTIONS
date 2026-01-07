import java.util.*;
public class First {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            char c[]=sc.next().toCharArray();
            char prev=c[0];
            String ans="Yes";
            for(int i=1;i<c.length;i++){
                if(c[i]==prev && c[i]=='Y'){
                    ans="No";
                    break;
                }
                else{
                   if(c[i]=='N' && prev=='N')
                   prev='N'; 
                   else prev='Y';
                }
            }
            System.out.println(ans);
        }
    }
}