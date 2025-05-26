import java.util.*;

public class DrTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char c[]=sc.next().toCharArray();
            int ans=0;
            for(char ch:c){
                if(ch=='1'){
                    ans++;
                }
            }
            int res=0;
            for(int i=0;i<n;i++){
                if(c[i]=='1'){
                    res+=(ans-1);
                }
                else{
                    res+=(ans+1);
                }
            }
            System.out.println(res);
        }
    }
}