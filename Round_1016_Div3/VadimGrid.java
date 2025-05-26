import java.io.*;
import java.util.*;

public class VadimGrid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int size = 1 << n;  // 2^n
            long total = (long) size * size;
            int q = Integer.parseInt(br.readLine());

            for (int i = 0; i < q; i++) {
                String[] parts = br.readLine().split(" ");
                if (parts[0].equals("->")) {
                    int x = Integer.parseInt(parts[1]) - 1;
                    int y = Integer.parseInt(parts[2]) - 1;
                    long val = findValue(x, y, n, 0);
                    output.append(val).append("\n");
                } else if (parts[0].equals("<-")) {
                    long d = Long.parseLong(parts[1]);
                    int[] res = findCoordinates(d, n, 0, 0, 0);
                    output.append((res[0] + 1)).append(" ").append((res[1] + 1)).append("\n");
                }
            }
        }

        System.out.print(output);
    }

    // Find value at (x, y)
    static long findValue(int x, int y, int level, long base) {
        if (level == 1) {
            int[][] order = {{0, 0}, {1, 1}, {1, 0}, {0, 1}};
            for (int i = 0; i < 4; i++) {
                if (x == order[i][0] && y == order[i][1]) {
                    return base + i + 1;
                }
            }
        }

        int half = 1 << (level - 1);
        long offset = 1L << (2 * (level - 1));

        if (x < half && y < half) {
            return findValue(x, y, level - 1, base); // top-left
        } else if (x >= half && y >= half) {
            return findValue(x - half, y - half, level - 1, base + offset); // bottom-right
        } else if (x >= half) {
            return findValue(x - half, y, level - 1, base + 2 * offset); // bottom-left
        } else {
            return findValue(x, y - half, level - 1, base + 3 * offset); // top-right
        }
    }

    static int[] findCoordinates(long d, int level, long base, int x0, int y0) {
        if (level == 1) {
            int[][] order = {{0, 0}, {1, 1}, {1, 0}, {0, 1}};
            for (int i = 0; i < 4; i++) {
                if (base + i + 1 == d) {
                    return new int[]{x0 + order[i][0], y0 + order[i][1]};
                }
            }
        }

        long offset = 1L << (2 * (level - 1));
        int half = 1 << (level - 1);

        if (d <= base + offset) {
            return findCoordinates(d, level - 1, base, x0, y0); // top-left
        } else if (d <= base + 2 * offset) {
            return findCoordinates(d, level - 1, base + offset, x0 + half, y0 + half); // bottom-right
        } else if (d <= base + 3 * offset) {
            return findCoordinates(d, level - 1, base + 2 * offset, x0 + half, y0); // bottom-left
        } else {
            return findCoordinates(d, level - 1, base + 3 * offset, x0, y0 + half); // top-right
        }
    }
}
