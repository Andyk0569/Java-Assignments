import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        // base cases
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined of negative numbers!!!");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        scanner.close();
    }
}
