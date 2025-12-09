package concept_implementation;

public class ExceptionExample {

    public static int intDivide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            System.out.println(intDivide(10, 0));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
