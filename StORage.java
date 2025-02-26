/*
Akito still has nowhere to live, and the price for a small room is everywhere. For this reason,
Akito decided to get a job at a bank as a key creator for storages.
In this magical world, everything is different. For example, the key for a storage with the code (n,x)
 is an array a of length n such that:
a1 | a2 | a3 | … | an=x
, where a | b is the bitwise "OR" of numbers a and b
.
MEX({a1,a2,a3,…,an}) is maximized among all such arrays.
Akito diligently performed his job for several hours, but suddenly he got a headache. Substitute for him for an hour; for the given n
 and x , create any key for the storage with the code (n,x)
MEX(S)  is the minimum non-negative integer z  such that z is not contained in the set S and all 0≤y<z are contained in S

Input
The first line contains the number t
 (1≤t≤104
) — the number of test cases.

In the only line of each test case, two numbers n
 and x
 (1≤n≤2⋅105,0≤x<230
) are given — the length of the array and the desired value of the bitwise "OR".

It is guaranteed that the sum of n
 across all test cases does not exceed 2⋅105
.

Output
For each test case, output n
 integers ai
 (0≤ai<230
) — the elements of the key array that satisfy all the conditions.

If there are multiple suitable arrays, output any of them.
 */


import java.util.*;
public class StORage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();  
            int target = sc.nextInt(); 

            if (n == 1) {
                System.out.println(target);
                continue;
            }

            int[] res = new int[n];
            int or[]=new int[n];
            for(int i=1;i<n;i++){
                or[i]=i|or[i-1];
            }
            int max=0;
            if(or[n-1]==target) max=n-1;
            else{
                for(int i=0;i<n-1;i++){
                    if((or[i]&target)==or[i]){
                        max=i;
                }
                }
            }
            //System.out.println(Arrays.toString(or));
            if(or[max]!=target){
                res[n-1]=target;
                if(max+1<=n)
                for(int i=0;i<=max;i++){
                    res[i]=i;
                }
                else{
                    for(int i=0;i<max;i++){
                        res[i]=i;
                }
            }
            }
            else{
                for(int i=0;i<=max;i++){
                    res[i]=i;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(res[j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
