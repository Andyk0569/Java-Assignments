package core;
import java.util.Scanner;

public class ArmStrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int num = scanner.nextInt();
        int digitCount = String.valueOf(num).length();
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        if (originalNum == sum) {
            System.out.println("Number is an ArmStrong Number.");
        } else {
            System.out.println("Number is not an ArmStrong Number!!!");
        }
        scanner.close();
    }
}
