import java.util.*;
import java.io.*;

public class FlowerBoy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            int collected = 0;
            int aPtr = n - 1;
            int bPtr = m - 1;
            
            while (bPtr >= 0 && aPtr >= 0) {
                if (a[aPtr] >= b[bPtr]) {
                    collected++;
                    aPtr--;
                    bPtr--;
                } else {
                    aPtr--;
                }
            }
            
            if (collected == m) {
                out.println(0);
                continue;
            }
            
            int firstUnsatisfied = bPtr;
            int maxB = b[firstUnsatisfied];
            
            int insertionPos = aPtr + 1;
            
            int[] newA = new int[n + 1];
            System.arraycopy(a, 0, newA, 0, insertionPos);
            newA[insertionPos] = maxB;
            System.arraycopy(a, insertionPos, newA, insertionPos + 1, n - insertionPos);
            
            Arrays.sort(newA);
            
            collected = 0;
            aPtr = n;
            bPtr = m - 1;
            
            while (bPtr >= 0 && aPtr >= 0) {
                if (newA[aPtr] >= b[bPtr]) {
                    collected++;
                    aPtr--;
                    bPtr--;
                } else {
                    aPtr--;
                }
            }
            
            if (collected == m) {
                out.println(maxB);
            } else {
                out.println(-1);
            }
        }
        out.flush();
    }
}