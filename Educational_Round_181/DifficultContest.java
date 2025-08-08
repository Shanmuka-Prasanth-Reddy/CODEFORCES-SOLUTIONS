import java.util.*;
public class DifficultContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            char c[]=sc.next().toCharArray();
            int freq[]=new int[26];
            for(char ch:c){
                freq[ch-'A']++;
            }
            char res[]=new char[c.length];
            int idx=0;
            for(int i=0;i<freq['t'-'a'];i++){
                res[idx++]='T';
            }
            freq['t'-'a']=0;
            for(int i=0;i<26;i++){
                for(int j=0;j<freq[i];j++){
                    res[idx++]=(char)('A'+i);
                }
            }
            System.out.println(new String(res));
        }
    }
}