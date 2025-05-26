import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            HashSet<Integer> s=new HashSet<>();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<2*n;i++) l.add(i+1);
            int p[]=new int[2*n+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(p[i+j-1]==0 && s.add(a[i-1][j-1])){
                        p[i+j-1]=a[i-1][j-1];
                        l.remove(l.indexOf(a[i-1][j-1]));
                    }
                }
            }
            for(int i=0;i<2*n;i++){
                if(p[i]!=0){
                    System.out.print(p[i]+" ");
                }
                else{
                    System.out.print(l.get(0)+" ");
                    l.remove(0);
                }
            }
            System.out.println();
        }
    }
}
