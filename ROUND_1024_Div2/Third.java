import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            int current = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 == 0) {
                        grid[i][j] = current++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 != 0) {
                        grid[i][j] = current++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}