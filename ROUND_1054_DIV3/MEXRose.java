import java.util.*;
public class MEXRose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(),c=0;
            int[] a = new int[n];
            HashSet<Integer> s = new HashSet<>();
            boolean hasK = false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                s.add(a[i]);
                if (a[i] == k){
                    hasK = true;
                    c++;
                }
            }
            int missing = 0;
            for (int x = 0; x < k; x++) {
                if (!s.contains(x)){
                    missing++;
                }
            }
            
            int ans = missing>c?missing:c;
            System.out.println(ans);
        }
    }
}
