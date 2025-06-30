import java.util.Scanner;

public class GoodStart{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long w = scanner.nextLong();
            long h = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long x1 = scanner.nextLong();
            long y1 = scanner.nextLong();
            long x2 = scanner.nextLong();
            long y2 = scanner.nextLong();
            
            if (x1 == x2){
                if (Math.abs(y1 - y2) % b == 0){
                    System.out.println("Yes");
                }
                else
                    System.out.println("No");
                continue;
            }
            if (y1 == y2){
                if (Math.abs(x1 - x2) % a == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
                continue;
            }
            if ((x1 - x2) % a == 0 || (y1 - y2) % b == 0){
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
        scanner.close();
    }
}