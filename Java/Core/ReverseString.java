import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {

        // Using StringBuilder with predefined capacity
        StringBuilder reversed = new StringBuilder(str.length());
        // Append characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        // convert to String and return
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        System.out.println(reverseString(original));
        scanner.close();
    }
}

/*
 * StringBuilder() without capacity starts with a small size and expands
 * multiple times.
 * new StringBuilder(str.length()) allocates exactly the required memory once.
 * 
 * Using new StringBuilder(str.length()) is more efficient in terms of memory
 * 
 * public static String reverseString(String str) {
 * return new StringBuilder(str).reverse().toString();
 * }
 */