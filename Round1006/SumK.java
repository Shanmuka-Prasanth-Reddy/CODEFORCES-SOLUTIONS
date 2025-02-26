
/*
 * Natsume Akito has just woken up in a new world and immediately received his first quest! The system provided him with an array a
 of n  zeros, an integer k, and an integer p.
In one operation, Akito chooses two integers i and x such that 1≤i≤n and −p≤x≤p, and performs the assignment ai=x.
Akito is still not fully accustomed to controlling his new body, so help him calculate the minimum number of operations required to make the sum of all elements in the array equal to k
, or tell him that it is impossible.
Input
The first line of input contains one integer t (1≤t≤1000) — the number of test cases.
The only line of each test case contains three integers n, k, p (1≤n≤50, −2500≤k≤2500, 1≤p≤50) 
— the length of the array, the required sum, and the boundary of the segment from which numbers can be replaced.

Output
For each test case, output the minimum number of operations to achieve the final sum k
 in the array, or −1 if it is impossible to achieve the sum k.
 */
import java.util.*;

public class SumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = Math.abs(sc.nextInt());
            int p = sc.nextInt();
            if (k > n * p) {
                System.out.println("-1");
            } 
            else {
                System.out.println((k+p-1)/p);
            }
        }
    }
}