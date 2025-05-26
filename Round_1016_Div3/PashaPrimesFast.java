import java.io.*;
import java.math.BigInteger;

public class PashaPrimesFast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            String x = parts[0];
            int k = Integer.parseInt(parts[1]);

            StringBuilder sb = new StringBuilder(x.length() * k);
            for (int i = 0; i < k; i++) {
                sb.append(x);
            }

            BigInteger y = new BigInteger(sb.toString());

            if (y.isProbablePrime(20)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
