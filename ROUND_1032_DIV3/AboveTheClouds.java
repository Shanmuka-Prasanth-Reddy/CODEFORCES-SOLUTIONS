import java.util.*;
public class AboveTheClouds{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            char c[]=sc.next().toCharArray();
            String ans="No";
            int freq[]=new int[26];
            for(int i=1;i<n-1;i++){
                freq[c[i]-'a']++;
                if(freq[c[i]-'a']>=2 || c[i]==c[0]|| c[i]==c[n-1]){
                    ans="Yes";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}