import java.util.*;
public class VadimCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            char c[]=sc.next().toCharArray();
            int a[]=new int[10];
            for(char ch:c){
                a[ch-'0']++;
            }
            for(int i=0;i<10;i++){
                    int j=9-i;
                    while(a[j]<=0){
                        j++;
                    }
                    System.out.print(j);
                    a[j]--;
            }
            System.out.println();
        }
    }
}