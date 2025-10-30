import java.util.*;
public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            ArrayList<Integer> l1=new ArrayList<>();
            ArrayList<Integer> l2=new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0) l2.add(a[i]);
                else l1.add(a[i]);
            }
            if(l1.size()>0 && l2.size()>0){
                Arrays.sort(a);
            }
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}