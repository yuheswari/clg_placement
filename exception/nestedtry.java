import java.util.*;
class nestedtry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt(); // nested try
            try {
                System.out.println("inner try starts");
                int arr[] = new int[n];
                int val = sc.nextInt();
                arr[7] = val; // may throw ArrayIndexOutOfBoundsException
            }
            catch (InputMismatchException e) {
                System.out.println("this contains input mismatch error: " + e);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e);
            }
        }
        catch (Exception e) {
            System.out.println("normal exception is found: " + e);
        }
    }
}