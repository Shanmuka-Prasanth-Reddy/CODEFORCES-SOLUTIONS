import java.util.*;

public class ThoseWhoAreWithUs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
             int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int max_val = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                max_val = Math.max(grid[i][j], max_val);
            }
        }
        int[] row_count = new int[n];
        int[] col_count = new int[m];
        int total_count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == max_val){
                    row_count[i]++;
                    col_count[j]++;
                    total_count++;
                }
            }
        }
        boolean ans = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int temp = row_count[i] + col_count[j];
                if(grid[i][j] == max_val)temp--;
                ans |= (temp >= total_count);
            }
        }
        if(ans){
            System.out.println(max_val - 1);
        }else System.out.println(max_val);
        }
    }
}
