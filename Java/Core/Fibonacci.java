import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {
        // base case
        if (n <= 1) {
            return n;
        }

        // recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
        scanner.close();
    }
}
