import java.util.*;

public class Pathless{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int size = sc.nextInt();
            int targetSum = sc.nextInt();
            int[] values = new int[size];
            for (int i = 0; i < size; i++) {
                values[i] = sc.nextInt();
            }

            int[] answer = getBlockedArrangement(values, targetSum);
            if (answer == null) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < answer.length; i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(answer[i]);
                }
                System.out.println();
            }
        }
    }
    static int[] getBlockedArrangement(int[] nums, int target) {
        int total = 0;
        for (int val : nums) total += val;

        if (target < total) {
            return Arrays.copyOf(nums, nums.length);
        }
        if (target == total || target >= total + 2) {
            return null;
        }
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        for (int num : nums) {
            if (num == 0) zeroCount++;
            else if (num == 1) oneCount++;
            else if (num == 2) twoCount++;
        }

        if (zeroCount == 0 || oneCount == 0 || twoCount == 0) {
            return null;
        }
        int[] arranged = new int[nums.length];
        int idx = 0;
        Arrays.fill(arranged, idx, idx + zeroCount, 0);
        idx += zeroCount;

        arranged[idx++] = 2;

        Arrays.fill(arranged, idx, idx + oneCount, 1);
        idx += oneCount;
        Arrays.fill(arranged, idx, arranged.length, 2);
        return arranged;
    }
}
