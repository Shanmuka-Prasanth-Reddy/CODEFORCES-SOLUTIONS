import java.io.*;
import java.util.*;
public class ComeALittleCloser {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> rf = new TreeMap<>();
            TreeMap<Integer,Integer> cf = new TreeMap<>();
            int[][] a = new int[n][2];
            for(int i=0;i<n;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a[i][0] = x;
                a[i][1] = y;
                rf.put(x,rf.getOrDefault(x, 0)+1);
                cf.put(y,cf.getOrDefault(y, 0)+1);
            }
            if(n < 3) {
                System.out.println(n);
                continue;
            }
            long minArea = Long.MAX_VALUE;
            for(int i=0;i<n;i++) {
                boolean rfRemoved = false;
                if(rf.get(a[i
                ][0]) == 1) {
                    rf.remove(a[i][0]);
                    rfRemoved = true;
                }
                boolean cfRemoved = false;
                if(cf.get(a[i][1]) == 1) {
                    cf.remove(a[i][1]);
                    cfRemoved = true;
                }
                long x = rf.lastKey() - rf.firstKey() + 1;
                long y = cf.lastKey() - cf.firstKey() + 1;
                long tempArea = x * y;
                if(tempArea < n) {
                    tempArea += Math.min(x, y);
                }
                minArea = Math.min(minArea, tempArea);
                if(rfRemoved) {
                    rf.put(a[i][0],1);
                }
                if(cfRemoved) {
                    cf.put(a[i][1],1);
                }
            }
            System.out.println(minArea);
        }
    }
}