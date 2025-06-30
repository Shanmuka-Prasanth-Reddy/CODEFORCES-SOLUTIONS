import java.util.*;

public class FibonacciCubesPacking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cubes to pack: ");
        int n = scanner.nextInt();
        List<Integer> fibonacciNumbers = generateFibonacci(n);
        System.out.println("Fibonacci numbers for packing cubes: " + fibonacciNumbers);
    }
}