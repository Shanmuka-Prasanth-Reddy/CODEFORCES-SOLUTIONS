import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int row[] = new int[n];
            int col[] = new int[m];
            
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    a[i][j] = s.charAt(j) - '0';
                }
            }
            
            boolean possible = true;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 1) {
                        boolean canBePushed = (row[i] == j) || (col[j] == i);
                        row[i]++;
                        col[j]++;
                        if (!canBePushed) {
                            possible = false;
                            break;
                        }
                    }
                }
                if (!possible) break;
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
        
        sc.close();
    }
}
