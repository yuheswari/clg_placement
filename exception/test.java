import java.util.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (!sc.hasNextInt()) {
                throw new InvalidInputException("Custom Exception: Please enter a valid integer.");
            }
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
        }
        catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: An arithmetic error occurred.");
        }
        catch (Exception e) {
            System.out.println("value is:" + e);
        }
        System.out.println("End of program");
    }
}