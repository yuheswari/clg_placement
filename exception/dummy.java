import java.util.*;




public class superkeydemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try { // outer try
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n < 0) {
                throw new IllegalArgumentException("Negative number not allowed.");
            }
            try { // inner try
                System.out.print("Enter a divisor: ");
                int d = sc.nextInt();
                if (d == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                System.out.println("Result: " + (n / d));
            } catch (InputMismatchException e) {
                System.out.println("Inner catch: Input mismatch - " + e);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic error - " + e);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Outer catch: Illegal argument - " + e);
        } catch (Exception e) {
            System.out.println("Outer catch: General exception - " + e);
        } finally {
            System.out.println("This is the finally block. It always executes.");
            sc.close();
        }
    }
}