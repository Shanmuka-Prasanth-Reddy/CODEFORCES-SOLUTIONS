import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                hs.add(a[i]);
            }
            if(hs.size() == 1) {
                System.out.println("NO");
                continue;
            }
            else{
                System.out.println("YES");
            }
            int x=0;
            for(int i=0;i<n;i++){
                if(a[i]>a[x]){
                    x=i;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]==a[x]){
                    System.out.print(2+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}