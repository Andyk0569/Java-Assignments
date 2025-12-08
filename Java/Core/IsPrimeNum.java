import java.util.Scanner;

public class IsPrimeNum {

    public static boolean isPrime(long num) {
        // Check for edge cases
        if (num < 2) {
            return false;
        }

        // Check for even numbers greater than 2
        if (num == 2) {
            return true;
        }

        // Eliminate even numbers before checking odd factors
        if (num % 2 == 0) {
            return false;
        }

        // Only check odd numbers
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

/*
 * Yes, a long uses more bytes than an int.
 * 
 * No, it does not meaningfully increase space complexity.
 * 
 * Yes, using long is still recommended because it avoids overflow and supports
 * larger inputs
 */